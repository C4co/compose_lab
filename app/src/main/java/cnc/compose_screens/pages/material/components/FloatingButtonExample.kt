package cnc.compose_screens.pages.material.components

import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color

@Composable
fun FloatingButtonExample() {
   FloatingActionButton(
      onClick = { /*TODO*/ },
      shape = CircleShape,
      containerColor = Color(0xFF6650a4),
      contentColor = Color.White,
   ) {
      Icon(
         imageVector = Icons.Default.Add,
         contentDescription = "Add",
      )
   }
}