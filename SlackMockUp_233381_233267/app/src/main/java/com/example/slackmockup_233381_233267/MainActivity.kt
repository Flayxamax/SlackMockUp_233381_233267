package com.example.slackmockup_233381_233267

import android.os.Bundle
import android.widget.SearchView
import androidx.activity.ComponentActivity
import com.example.slackmockup_233381_233267.databinding.ActivityMainBinding
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.core.content.ContextCompat
import com.example.slackmockup_233381_233267.ui.theme.SlackMockUp_233381_233267Theme

class MainActivity : ComponentActivity() {

    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        val searchView = binding.searchEditText

        searchView.queryHint = "Jump to or search..."

    }
}