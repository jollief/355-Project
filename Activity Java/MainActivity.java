public class MainActivity extends AppCompatActivity {
    
    Button btnWelcome, btnToday, btnFood, btnGraph, btnProfile;
	
	TextView tv;
	
	int current, goal;
	
	@Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
		
		btnWelcome = findViewById(R.id.button);
		btnToday = findViewById(R.id.button2);
		btnFood	= findViewById(R.id.button3);
		btnGraph = findViewById(R.id.button4);
		btnProfile = findViewById(R.id.button5);
		
		current = food calories added up;
		goal = user inputted goal;
		
		tv = findViewById(R.id.textView);
		
		tv.setText('You are within your calorie goal today ' + '(' + current + '/' + goal + ')'; 
		
	}
	
	//Welcome button action
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
	
	
