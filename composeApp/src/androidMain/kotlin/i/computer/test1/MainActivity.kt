package i.computer.test1

import BaseScreen
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
          //  BaseScreen {
           //     App()
                App3()
          //  }
        }
    }
}

@Preview
@Composable
fun AppAndroidPreview() {
    App()
}