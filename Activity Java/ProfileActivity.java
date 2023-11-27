public class ProfileActivity extends AppCompatActivity {

EditText username, max, min;

Button find, btnWelcome, btnToday, btnFood, btnGraph, btnProfile;

	@Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);
		
		btnWelcome = findViewById(R.id.button);
		btnToday = findViewById(R.id.button2);
		btnFood	= findViewById(R.id.button3);
		btnGraph = findViewById(R.id.button4);
		btnProfile = findViewById(R.id.button5);
		
		find = findViewById(R.id.button6);
		
		username = findViewById(R.id.editText);
		max = findViewById(R.id.editText2);
		min = findViewById(R.id.editText3);
		
	}
	
	public void on6Click(View v){
		//set goal to min and max inputted value
	}
	//MainActivity action
	public void onClick(View v){
		Intent intent = new Intent(this, MainActivity.class);
		startActivity(intent);
	}
	//Today's diet action
	public void on2Click(View v){
		Intent intent = new Intent(this, DietActivity.class);
		startActivity(intent);
	}
	//Food items action
	public void on3Click(View v){
		Intent intent = new Intent(this, FoodActivity.class);
		startActivity(intent);
	}
	//Graph action
	public void on4Click(View v){
		Intent intent = new Intent(this, GraphActivity.class);
		startActivity(intent);
	}
	//Profile action
	public void on5Click(View v){
		Intent intent = new Intent(this, ProfileActivity.class);
		startActivity(intent);
	}
}