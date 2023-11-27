public class NewItemActivity extends AppCompatActivity {
	
	
	EditText etName, etCal, etInfo;
	
	ImageView iv;
	Drawable //food image
	
	Button confirm;
	
	@Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_newItem);
		
		etName = findViewById(R.id.editText);
		etCal = findViewById(R.id.editText2);
		etInfo = findViewById(R.id.editText3);

		iv = findViewById(R.id.imageView);
		
		//food item = ResourcesCompat.getDrawable(getResources(), R.drawable.//drawable id, null);
		        iv.setImageDrawable(null);
				
	}
	//When clicking confirm
	public void onClick(View v){
		//add values from etName, etCal, and etInfo and the image(maybe) into the food database
		
		Intent intent = new Intent(this, FoodActivity.class);
		startActivity(intent);
	}
}