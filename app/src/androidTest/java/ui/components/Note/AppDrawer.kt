import android.graphics.ColorFilter
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Menu
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.notes.routing.JetNotesRouter
import com.example.notes.routing.Screen
import androidx.example.notes.ui.theme.JetNotesTheme
import androidx.example.notes.ui.theme.JetNotesThemeSettings


@Composable
private fun AppDraweHeader(){
    Row(modifier = Modifier.fillMaxSize()){
        Image(
            imageVector = Icons.Filled.Menu,
            contentDescription = "Drawer Header Icon",
            colorFilter = ColorFilter
                .tint(MaterialTheme.colors.onSurface),
            modifier = Modifier.padding(16.dp)

        )
        Text(
            text = "Заметки",
            modifier = Modifier
                .align(alignment = Alignment.CenterVertically)
        )
    }
}

@Preview
@Composable
fun AppDrawerHeaderPreview(){
    JetNotesTheme {
        AppDraweHeader()
    }
}