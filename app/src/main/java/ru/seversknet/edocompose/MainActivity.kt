package ru.seversknet.edocompose


import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import ru.seversknet.edocompose.ui.screens.MainScreen

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MainScreen()
        }
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