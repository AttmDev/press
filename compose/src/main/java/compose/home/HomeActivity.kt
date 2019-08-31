package compose.home

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import compose.editor.EditorView
import compose.theme.DraculaTheme

class HomeActivity : AppCompatActivity() {

  override fun onCreate(savedInstanceState: Bundle?) {
    theme().apply(this)
    super.onCreate(savedInstanceState)
    setContentView(EditorView(this, theme()))
  }

  private fun theme() = DraculaTheme
}