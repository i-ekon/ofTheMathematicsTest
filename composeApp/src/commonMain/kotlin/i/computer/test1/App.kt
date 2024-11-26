package i.computer.test1

import BaseScreen
import androidx.compose.animation.AnimatedVisibility
import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.material.Button
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import coil3.ImageLoader
import coil3.compose.AsyncImage
import coil3.compose.LocalPlatformContext
import coil3.compose.rememberAsyncImagePainter
import coil3.decode.Decoder
import coil3.request.ImageRequest
import coil3.svg.SvgDecoder
import org.jetbrains.compose.resources.painterResource
import org.jetbrains.compose.ui.tooling.preview.Preview

import i_computertest1.composeapp.generated.resources.Res
import i_computertest1.composeapp.generated.resources.compose_multiplatform
import i_computertest1.composeapp.generated.resources.iturtle
import org.jetbrains.compose.resources.ExperimentalResourceApi

@OptIn(ExperimentalResourceApi::class)
@Composable
@Preview
fun App() {
    MaterialTheme {
        var showContent by remember { mutableStateOf(false) }

        Text(
            text = "i-ComputerTest1 + COIL3",
            fontSize = 22.sp,
            fontStyle = FontStyle.Normal,
            color = Color.Red,

            )
        //----------------------------------[AsyncImage]------------------------------------------
        val myImage =
            "https://firebasestorage.googleapis.com/v0/b/of-the-mathematics-btj.appspot.com/o/images%2Fiturtle.png?alt=media&token=22adafbf-bcfe-4c2d-827c-d128aaa3f307"
        val iTurtle3 = ImageRequest.Builder(LocalPlatformContext.current)
            .data(myImage)
            .build()

        val iTurtle2 =Res.getUri("drawable/iturtle.png")

        //-------------------------------------[Image]---------------------------------------------
        val iTurlte = painterResource(Res.drawable.iturtle)
        val iTurlte0 = rememberAsyncImagePainter(
            model = ImageRequest.Builder(LocalPlatformContext.current)
                .data(myImage)
                .build()
        )
        //-----------------------------------[svg]----------------------------------------------
        val imageSVG ="https://firebasestorage.googleapis.com/v0/b/of-the-mathematics-btj.appspot.com/o/images%2FiComputer7c.svg?alt=media&token=9f11088c-96c9-4bb9-ab78-84f192cd12cd"


        val myImageLoader = ImageLoader.Builder(LocalPlatformContext.current)
            .components {
                add(SvgDecoder.Factory())
            }
            .build()

        val svgPaint =  rememberAsyncImagePainter(
            model = imageSVG,   // /home/j0hnny/j0hnnyApp_elements/FORCOPY/turtle/iComputer7c.svg
            imageLoader = myImageLoader
        )

        Column(Modifier.fillMaxWidth(), horizontalAlignment = Alignment.CenterHorizontally) {
            Button(onClick = { showContent = !showContent }) {
                Text("Click me!")
            }


            AnimatedVisibility(showContent) {
                val greeting = remember { Greeting().greet() }
                Column(Modifier.fillMaxWidth(), horizontalAlignment = Alignment.CenterHorizontally) {
                    Image(iTurlte, null)
                    Text("Compose: $greeting")

                    AsyncImage(
                       modifier = Modifier
                            .border(2.dp, Color.Magenta)
                            .width(150.dp)
                            .height(150.dp),
                        model = iTurtle2, //Res.getUri("drawable/iturtle.png")
                        contentDescription = "sdb",
                        contentScale = ContentScale.Fit,
                        //placeholder = iTurlte
                    )

                    AsyncImage(
                        modifier = Modifier
                            .border(2.dp, Color.Magenta)
                            .width(150.dp)
                            .height(150.dp),
                        model = myImage , //iTurtle3,
                        contentDescription = "sdb",
                        contentScale = ContentScale.Fit,
                        //placeholder = iTurlte
                    )
                    Text(
                        text = "i-Computer",
                        fontSize = 22.sp,
                        fontStyle = FontStyle.Normal,
                        color = Color.Green,

                    )
                    Image(
                        modifier = Modifier
                            .border(2.dp, Color.Magenta)
                            .width(100.dp)
                            .height(102.dp),
                        painter = iTurlte,
                        contentDescription = ""
                    )
                    Image(
                        modifier = Modifier
                            .border(2.dp, Color.Magenta)
                            .width(400.dp)
                            .height(102.dp),
                        painter = svgPaint, //svgPaint , //  iTurlte0,
                        contentDescription = ""
                    )
                }
            }
        }
    }
}



@OptIn(ExperimentalResourceApi::class)
@Composable
@Preview
fun App3() {
 //   MaterialTheme {
    BaseScreen{
        var showContent by remember { mutableStateOf(false) }
        Text(
            text = "i-ComputerTest1 + COIL3",
            fontSize = 22.sp,
            fontStyle = FontStyle.Normal,
            color = Color.Blue,

            )

        //-----------------------------------[svg]----------------------------------------------
        val imageSVG ="https://firebasestorage.googleapis.com/v0/b/of-the-mathematics-btj.appspot.com/o/images%2FiComputer7c.svg?alt=media&token=9f11088c-96c9-4bb9-ab78-84f192cd12cd"


        val myImageLoader = ImageLoader.Builder(LocalPlatformContext.current)
            .components {
                add(SvgDecoder.Factory())
            }

            .build()

        val svgPaint =  rememberAsyncImagePainter(
            model = imageSVG,   // /home/j0hnny/j0hnnyApp_elements/FORCOPY/turtle/iComputer7c.svg
            imageLoader = myImageLoader
        )
        Image(
            modifier = Modifier
                .border(2.dp, Color.Magenta)
                .width(200.dp)
                .height(202.dp),
            painter = svgPaint, //svgPaint , //  iTurlte0,
            contentDescription = ""
        )


        //----------------------------------[AsyncImage]------------------------------------------
        val myImage =
            "https://firebasestorage.googleapis.com/v0/b/of-the-mathematics-btj.appspot.com/o/images%2Fiturtle.png?alt=media&token=22adafbf-bcfe-4c2d-827c-d128aaa3f307"
        val iTurtle3 = ImageRequest.Builder(LocalPlatformContext.current)
            .data(myImage)
            .build()

        val iTurtle2 =Res.getUri("drawable/iturtle.png")

        //-------------------------------------[Image]---------------------------------------------
        val iTurlte = painterResource(Res.drawable.iturtle)
        val iTurlte0 = rememberAsyncImagePainter(
            model = ImageRequest.Builder(LocalPlatformContext.current)
                .data(myImage)
                .build()
        )

        Column(Modifier.fillMaxWidth(), horizontalAlignment = Alignment.CenterHorizontally) {
            Button(onClick = { showContent = !showContent }) {
                Text("Click me!")
            }


            AnimatedVisibility(showContent) {
                val greeting = remember { Greeting().greet() }
                Column(Modifier.fillMaxWidth(), horizontalAlignment = Alignment.CenterHorizontally) {
                    Image( modifier = Modifier
                             .border(2.dp, Color.Black)
                             .width(150.dp)
                             .height(150.dp),
                        painter = iTurlte,
                        contentDescription = null)
                    Text("Compose: $greeting")
                    Row {
                        AsyncImage(
                            modifier = Modifier
                                .border(2.dp, Color.Magenta)
                                .width(150.dp)
                                .height(150.dp),
                            model = iTurtle2, //Res.getUri("drawable/iturtle.png")
                            contentDescription = "sdb",
                            contentScale = ContentScale.Fit,
                            //placeholder = iTurlte
                        )

                        AsyncImage(
                            modifier = Modifier
                                .border(2.dp, Color.Magenta)
                                .width(150.dp)
                                .height(150.dp),
                            model = myImage, //iTurtle3,
                            contentDescription = "sdb",
                            contentScale = ContentScale.Fit,
                            //placeholder = iTurlte
                        )
                        Text(
                            text = "i-ComputerTest1 + COIL3",
                            fontSize = 22.sp,
                            fontStyle = FontStyle.Normal,
                            color = Color.Green,

                            )
                        Image(
                            modifier = Modifier
                                .border(2.dp, Color.Magenta)
                                .width(100.dp)
                                .height(102.dp),
                            painter = iTurlte,
                            contentDescription = ""
                        )
                    }

                }
            }
        }
    }
}