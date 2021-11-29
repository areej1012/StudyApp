package com.example.studyapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class AndroidContent : AppCompatActivity() {
    lateinit var rv: RecyclerView
    lateinit var contentAndroid: ArrayList<Content>
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_android_content)
        rv = findViewById(R.id.rva)
        title ="Android Review"
        setUpContent()
        rv.adapter = RecyclerViewAdapter(contentAndroid, this)
        rv.layoutManager = LinearLayoutManager(this)
    }

    fun setUpContent() {
        contentAndroid = arrayListOf<Content>(
            Content(
                "Drawable",
                "Contains the images for the app",
                "Make sure that the name of image is lowercased with no spaces"
            ),
            Content(
                "Layout",
                "This file shows the UI design of the app", "Contains the activity_main.xml file"
            ),
            Content(
                "Value",
                "Contains color.xml and string.xml files and themes folder",
                "color.xml is a holder that has the colors that we want to use for the app\n" +
                        "string.xml has the name of the app"
            ),
            Content(
                "Console",
                "We can print to console in Android Studio by using Log.d( message)",
                "We then go to Logcat at the bottom of the screen and search: MainActivity"
            ),
            Content(
                "Initializing UI Elements",
                "We can find the view type and id name in the activitiy_main.xml file",
                "We use findViewById<View Type>(R.id.NameofID)"
            ),
            Content(
                "OnClickListiner",
                "We can make the button do something when we click on it.",
                " myButton.setOnClickListener { myFuction() }"
            ),
            Content(
                "Snackbar", " use a Snackbar to display alerts in application.",
                "Snackbar.make(lyout, “Message”,Snackbar.short).show())"
            ),
            Content(
                "Activity Lifecycle", "Every application consists of at least one Activity.",
                "We can access the remaining states of our activity by overriding the following methods; " +
                        "onStart(), onResume(), onPause(), onStop(), and onDestroy()."
            ),
            Content(
                "Menus", "All Android Studio Activities support options menus",
                "We can use these menus to make navigation easier or to give users a range of options.\n" +
                        "To create a menu, we first have to create its XML file."
            ),
            Content(
                "Alert Dialogs", "Alert Dialogs give us more flexibility",
                " allowing us to use buttons and get user input in our alerts.\n  // first we create a variable to hold an AlertDialog builder\n" +
                        " val dialogBuilder = AlertDialog.Builder(this)\n" +
                        " dialogBuilder.setMessage(\"Enter your message:\")\n" +
                        " .setPositiveButton(\"Submit\", DialogInterface.OnClickListener {\n" +
                        "    dialog, id -> messages.add(input.text.toString())\n" +
                        "  })\n" +
                        " val alert = dialogBuilder.create()\n" +
                        " alert.setTitle(\"New Message\")\n" +
                        " alert.show()"
            ),
            Content(
                "Recreate Activity", "to recreate our main activity manually",
                "Add an OnClickListener to the Button and call this.recreate() when the button is pressed."
            ),
            Content(
                "Recycler View",
                "It's way to display long lists of items to the user",
                " Recycler View allows us to display as many items on the screen as we want\n" +
                        "These items can be as simple as a line of text, or as complex as \n" +
                        "our imagination allows. They can be card views, with embedded videos, images, and more"
            ),
            Content(
                "Saving / Restoring Instance States",
                " allows to enable screen rotation without losing data",
                "use these functions\n " +
                        "override fun onSaveInstanceState(outState: Bundle) and   override fun onRestoreInstanceState(savedInstanceState: Bundle)"
            ),
            Content(
                "Shared Preferences",
                "allow to save data to the user's device",
                "To use Shared Preferences, we first have to declare our Shared Preferences variable\n" +
                        "then add this line in string.xml \n " +
                        "<string name=\"preference_file_key\">com.example.helloworld.PREFERENCE_FILE_KEY</string>\n " +
                        "and then you can use it"
            )
        )
    }
}