package ru.seversknet.edocompose


import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.lifecycleScope
import kotlinx.coroutines.launch
import ru.seversknet.edocompose.data.api.Status
import ru.seversknet.edocompose.ui.screens.MainScreen
import ru.seversknet.edocompose.ui.screens.StartScreen
import ru.seversknet.edocompose.ui.viewmodels.tasksViewModel

class MainActivity : ComponentActivity() {

    private lateinit var viewModel: tasksViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            StartScreen()
        }

        viewModel = ViewModelProvider(this).get(tasksViewModel::class.java)

        lifecycleScope.launch {
            viewModel.taskState.collect {
                when (it.status) {
                    Status.LOADING -> ""
                    Status.ERROR -> {
                        Log.e("COR", "${it.message}")
                    }
                    Status.SUCCESS -> {
                        it.data.let { tasks ->

                        }
                    }
                }
            }
        }
    }
}


