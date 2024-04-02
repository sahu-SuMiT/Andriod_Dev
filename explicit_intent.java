//Explicit Intent

        EditText urlText=findViewById(R.id.editTextURL);
        EditText dialText=findViewById(R.id.editTextPhoneNumber);

        Button buttondial=findViewById(R.id.buttondial);
        Button buttonURL=findViewById(R.id.buttonURL);

        buttondial.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String phoneNumber=dialText.getText().toString();
                if(!phoneNumber.isEmpty()){
                    Uri number = Uri.parse("tel:"+phoneNumber);
                    Intent callIntent=new Intent(Intent.ACTION_DIAL,number);
                    startActivity(callIntent);
                }
                else{
                    Toast.makeText(getApplicationContext(),"Please Enter a Valid Number", Toast.LENGTH_SHORT).show();
                }
            }
        });
        buttonURL.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String url = urlText.getText().toString();
                if(!url.isEmpty()){
                    Intent intent = new Intent(Intent.ACTION_VIEW);
                    intent.setData(Uri.parse(url));
                    startActivity(intent);
                }
                else{
                    Toast.makeText(getApplicationContext(),"Please enter a valid url",Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
