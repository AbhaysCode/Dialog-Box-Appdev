package com.example.dialogbox

import android.content.DialogInterface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import com.example.dialogbox.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding:ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btn1.setOnClickListener{
            val builder1 = AlertDialog.Builder(this)
            builder1.setTitle("Are You Sure ?")
            builder1.setMessage("Do You Want to Exit ?")
            builder1.setIcon(R.drawable.baseline_exit_to_app_24)
            builder1.setPositiveButton("Yes",DialogInterface.OnClickListener { dialog, which ->
                finish()
            })
            builder1.setNegativeButton("No",DialogInterface.OnClickListener { dialog, which ->

            })
            builder1.show()
        }

        binding.btn2.setOnClickListener{
            val options = arrayOf("Death Note","Naruto","Y Jang")
            val builder2 = AlertDialog.Builder(this)
            builder2.setTitle("What is the best Anime ?")
            builder2.setSingleChoiceItems(options,0,DialogInterface.OnClickListener { dialog, which ->
                Toast.makeText(this,"You Selected ${options[which]}",Toast.LENGTH_SHORT).show()
            })
            builder2.setPositiveButton("Accept",DialogInterface.OnClickListener { dialog, which ->

            })
            builder2.setNegativeButton("Reject",DialogInterface.OnClickListener { dialog, which ->

            })
            builder2.show()
        }

        binding.btn3.setOnClickListener{
            val options = arrayOf("Sherlock Holmes","Suits","Freinds")
            val builder3 = AlertDialog.Builder(this)
            builder3.setTitle("What Have You Watched ?")
            builder3.setMultiChoiceItems(options,null,DialogInterface.OnMultiChoiceClickListener { dialog, which, isChecked ->
                Toast.makeText(this,"You Selected ${options[which]}",Toast.LENGTH_SHORT).show()
            })
            builder3.setPositiveButton("Done",DialogInterface.OnClickListener { dialog, which ->

            })
            builder3.setNegativeButton("Cancel",DialogInterface.OnClickListener { dialog, which ->

            })
            builder3.show()
        }
    }
}