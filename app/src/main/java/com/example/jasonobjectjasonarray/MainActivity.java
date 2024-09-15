package com.example.jasonobjectjasonarray;

import android.os.Bundle;
import android.util.Log;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String jsonString = "{ \"name\": \"khaled\", \"age\": 22 }";
        JSONObject jsonObject;


            try {
                jsonObject = new JSONObject(jsonString);
                String name=jsonObject.getString("name");
                int age=jsonObject.getInt("age");
                Log.d("jsonobject",name);
                Log.d("jsonobject",age+"");

            } catch (JSONException e) {
                throw new RuntimeException(e);
            }
         String jsonArrayString = "[{ \"name\": \"khaled\", \"age\": 22 }, { \"name\": \"ahmad\", \"age\": 20 }]";
         try {
            JSONArray jsonArray=new JSONArray(jsonArrayString);
            for(int i=0;i<jsonArray.length();i++){
                JSONObject person = jsonArray.getJSONObject(i);
                String name=person.getString("name");
                int age=person.getInt("age");
                Log.d("jsonarray",name);
                Log.d("jsonarray",age+"");
            }
         } catch (JSONException e) {
            throw new RuntimeException(e);
         }

        String jsonnestedstring = "{ \"name\": \"John\", \"address\": { \"city\": \"New York\", \"zip\": \"10001\" } }";
        try {
            JSONObject jsonObject1 = new JSONObject(jsonnestedstring);
            String name = jsonObject1.getString("name");
            JSONObject address = jsonObject1.getJSONObject("address");
            String city = address.getString("city");
            String zip = address.getString("zip");
            Log.d("jsonnested",city);
            Log.d("jsonnested",zip+"");
        } catch (JSONException e) {
            e.printStackTrace();
        }

        // Create a Gson instance
        Gson gson = new Gson();

        // Create a Person object
        Person person = new Person("John", 30);

        // Convert the Person object to JSON
        String jsonstring = gson.toJson(person);
        // Output: {"name":"John","age":30}
        Log.d("GSon",jsonString);


        Gson gson1 = new Gson();

        // JSON string
        String jsonString1 = "{\"name\":\"kahled\",\"age\":22}";

        Person person1 = gson1.fromJson(jsonString1, Person.class);

        Log.d("GSONDESERILIZATION",person1.name);
        Log.d("GSONDESERILIZATION",person1.age+"");




        // Create a Gson instance
        Gson gson3 = new Gson();

        // JSON array string
        String jsonArrayString3 = "[{\"name\":\"John\",\"age\":30}, {\"name\":\"Jane\",\"age\":25}]";

        // Specify the type for the List of Person
        Type listType = new TypeToken<List<Person>>() {}.getType();

        // Convert JSON array string to List of Person objects
        List<Person> personList = gson.fromJson(jsonArrayString3, listType);

        // Output: John, Jane
        for (Person person2 : personList) {
            Log.d("GSONLIST1",person2.name+" / "+person2.age);
        }


        JSONObject jsonobject5=new JSONObject();
        try {
            jsonobject5.put("name","khaled");
            jsonobject5.put("age",30);
            Log.d("makejsonobject",jsonobject5.toString());
        } catch (JSONException e) {
            throw new RuntimeException(e);
        }


        JSONObject jsonobject7=new JSONObject();
        JSONObject jsonobject8=new JSONObject();
        JSONObject jsonobject9=new JSONObject();
        try {
            jsonobject7.put("name","khaled");
            jsonobject7.put("age",30);
            jsonobject8.put("name","ahamd");
            jsonobject8.put("age",35);
            jsonobject9.put("name","ali");
            jsonobject9.put("age",40);
            JSONArray jsonArray=new JSONArray();
            jsonArray.put(jsonobject7);
            jsonArray.put(jsonobject8);
            jsonArray.put(jsonobject9);
            Log.d("makejsonarray",jsonArray.toString());


        } catch (JSONException e) {
            throw new RuntimeException(e);
        }




    }
}