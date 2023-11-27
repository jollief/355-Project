public class FoodActivity extends AppCompatActivity {

	Spinner foodSpinner;
	
	EditText label;
	
	TextView info;

	Button newItem, btnWelcome, btnToday, btnFood, btnGraph, btnProfile;
	
	String [] food = {"Hamburger", "Pizza", "Chicken", "Steak", etc}; //This should include all saved food items
	@Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_food);
		
		btnWelcome = findViewById(R.id.button);
		btnToday = findViewById(R.id.button2);
		btnFood	= findViewById(R.id.button3);
		btnGraph = findViewById(R.id.button4);
		btnProfile = findViewById(R.id.button5);
		
		newItem = findViewById(R.id.button6);
		
		label = findViewByIdR.id.editText); //label displaying the selected item
		
		info = findViewById(R.id.textView); //info section on the food
		
		foodSpinner = findViewById(R.id.//spinner id in xml);
		foodSpinner.setOnItemSelectListener(this);
		
		ArrayAdapter<String> ad = new ArrayAdapter<String>
			(this, android.R.layout.simple_spinner_dropdown_item, food);
		
		ad.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
		foodSpinner.setAdapter(ad);
	}
	
	public void onItemSelected(AdapterView<*> parent, View view, int position, long id)
	{
		String text = foodSpinner.getSelectedItem().toString();
		label.setText(text)
		
		if (text == "Hamburger")
		{
			info.setText("Hamburger info");
		}
		if (text == "Pizza")
		{
			info.setText("Pizza info");
		}
		if (text == "Chicken")
		{
			info.setText("Chicken info");
		}
		if (text == "Steak")
		{
			info.setText("Steak info");
		}
	}
	
	public void onNothingSelectd(AdapterView<*> parent){
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
	//Send to add new item
	public void onNewItemClick(View v) {
		Intent intent = new Intent(this, NewItemActivity.class);
		startActivity(intent);
	}
}