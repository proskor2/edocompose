package ru.seversknet.edocompose

import android.content.Context
import android.os.Bundle
import android.util.Base64
import android.util.Log
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import ru.seversknet.edocompose.ui.screens.listscreen
import ru.seversknet.edocompose.ui.screens.startscreen
import ru.seversknet.edocompose.ui.theme.EdocomposeTheme
import ru.seversknet.edosevadm.api.ApiTasks
import ru.seversknet.edosevadm.models.Tasks

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            startscreen()
        }
    }

    override fun onResume() {
        super.onResume()

    }
}


@Preview(showBackground = true)
@Composable
fun DefaultPreview() {

}

///////////////////////////////////////////////////////////////////////////////////////////0LHQsNCx0LXQvdGL0YjQtdCy0LLQsjpxaGM4M3A=
//// get review tasks
//fun getReviewTasks() {
//    val apiinterface =
//        ApiTasks.create("http://192.168.64.86/edo/hs/").getTasks("Basic "+TasksList.token, "review")
//    apiinterface.enqueue(object : Callback<List<Tasks>> {
//        override fun onResponse(
//            call: Call<List<Tasks>>,
//            response: Response<List<Tasks>>?
//        ) {
//            val resp = response?.body()
//            if (resp != null) {
//                TasksList.listReview = resp
//            }
//
//        }
//
//        override fun onFailure(call: Call<List<Tasks>>, t: Throwable) {
//        Log.d("RF", t.message.toString())
//        }
//    })
//}
/////////////////////////////////////////////////////////////////////////////////////////////////////////