import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.ColumnScope
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp


@Composable
fun  BaseScreen(
    context: @Composable ColumnScope.() -> Unit,
) {
    Column(
        modifier = Modifier
            //.fillMaxSize(0.7f)
            .padding( top = 20.dp , bottom = 50.dp)
            .padding( horizontal = 10.dp)
            .fillMaxWidth()
            .fillMaxHeight()
            //   .width( IntrinsicSize.Min)
            //  .alpha(0.9f)
            //  .background(Color(0xFFC3C2C4)),
            .border(2.dp, Color(0xFFE7AB1D), RoundedCornerShape(15.dp))
            .background(color = Color(0xFF1F1F1F).copy(alpha = 0.7f), shape = RoundedCornerShape(15.dp)),
        //   .background(color = Color(0xFFC3C2C4).copy(alpha = 0.7f),  shape = RoundedCornerShape(15.dp)),
        // .background(Color(0xBC19191B), RoundedCornerShape(15.dp) ),
        verticalArrangement = Arrangement.spacedBy(5.dp, alignment = Alignment .CenterVertically)    ,//.spacedBy(30.dp, Alignment.CenterVertically ),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        context()
    }

}