package com.br.lordui

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.br.lord.slideview.DataSlide
import com.br.lord.slideview.SliderView
import com.br.lordui.ui.theme.LorduiTheme
import com.google.accompanist.pager.ExperimentalPagerApi

class MainActivity : ComponentActivity() {
    @OptIn(ExperimentalPagerApi::class)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val data = arrayOf(
            DataSlide("Title slide one", "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Curabitur id.", img = R.drawable.piplup),
            DataSlide("title slide two", "Sed id velit non sapien laoreet sodales. Curabitur aliquet sem nunc, fringilla ultrices lacus iaculis id.", img = R.drawable.chamander),
            DataSlide("title slidde three", "Maecenas porttitor a metus sit amet venenatis.", img = R.drawable.sprigatito),
            DataSlide("title slidde three", "Maecenas porttitor a metus sit amet venenatis.", img = R.drawable.sprigatito),
            DataSlide("title slidde three", "Maecenas porttitor a metus sit amet venenatis.", img = R.drawable.sprigatito),
        )
        setContent {
            LorduiTheme {
                SliderView(
                    items = data
                )
            }
        }
    }
}

@OptIn(ExperimentalPagerApi::class)
@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    val data = arrayOf(
        DataSlide("Title slide one", "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Curabitur id.", img = R.drawable.piplup),
        DataSlide("title slide two", "Sed id velit non sapien laoreet sodales. Curabitur aliquet sem nunc, fringilla ultrices lacus iaculis id.", img = R.drawable.chamander),
        DataSlide("title slidde three", "Maecenas porttitor a metus sit amet venenatis.", img = R.drawable.sprigatito),
    )
    LorduiTheme {
        SliderView(
            items = data
        )
    }
}