package com.example.bizcardapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.CornerSize
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Divider
import androidx.compose.material3.MaterialTheme

import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.bizcardapp.ui.theme.BizCardAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            BizCardAppTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    CreateBizCard()
                }
            }
        }
    }
}

@Composable
fun CreateBizCard(){
    Surface(modifier = Modifier
        .fillMaxWidth()
        .fillMaxHeight()) {
       Card (modifier = Modifier
           .width(200.dp)
           .height(390.dp)
           .padding(12.dp),
           shape = RoundedCornerShape(corner = CornerSize(15.dp)),
            colors = CardDefaults.cardColors(containerColor= Color.White),
           elevation=CardDefaults.cardElevation(defaultElevation = 4.dp)
           ){
          Column (modifier = Modifier
              .height(300.dp),
              verticalArrangement = Arrangement.Top,
              horizontalAlignment = Alignment.CenterHorizontally){
              CreateImageProfile()
              Divider()
              Column (modifier = Modifier.padding(5.dp)){
                Text(text = "Subhash",
                    style =MaterialTheme.typography.headlineLarge)
              }

          }
       }
    }
}

@Composable
private fun CreateImageProfile() {
    Surface(
        modifier = Modifier
            .size(150.dp)
            .padding(5.dp),
        shape = CircleShape,
        border = BorderStroke(0.5.dp, Color.LightGray),
        tonalElevation = 4.dp,
//     color = MaterialTheme.colors.primary.copy(alpha = 0.5f)
    ) {
        Image(
            painter = painterResource(id = R.drawable.profile_image),
            contentDescription = "profile image",
            modifier = Modifier.size(150.dp),
        )
    }
}


@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    BizCardAppTheme {
        CreateBizCard()
    }
}