package com.example.ui.theme

import android.os.Build
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color

private val DarkColorScheme = darkColorScheme(
    primary = BluePrimaryDark,
    secondary = BlueSecondaryDark,
    tertiary = AccentAmber,
    background = DarkBackground,
    surface = DarkSurface,
    surfaceVariant = DarkSurfaceVariant,
    onPrimary = Color.Black,
    onSecondary = Color.Black,
    onBackground = Color(0xFFE1EAF2),
    onSurface = Color(0xFFE1EAF2)
)

private val LightColorScheme = lightColorScheme(
    primary = BluePrimary,
    onPrimary = Color.White,
    primaryContainer = LightBlueContainer,
    onPrimaryContainer = BluePrimaryVariant,
    secondary = BlueSecondary,
    onSecondary = Color.White,
    secondaryContainer = Color(0xFFE0F7FA),
    onSecondaryContainer = BlueSecondaryVariant,
    tertiary = AccentAmber,
    background = LightBlueBackground,
    onBackground = TextPrimaryDark,
    surface = LightBlueSurface,
    onSurface = TextPrimaryDark,
    surfaceVariant = LightBlueSurfaceVariant,
    onSurfaceVariant = TextSecondaryDark,
    outline = LightBlueBorder
)

@Composable
fun MyApplicationTheme(
    darkTheme: Boolean = isSystemInDarkTheme(),
    content: @Composable () -> Unit
) {
    // Keep consistent crisp light blue theme, respecting dark mode when system requests it
    val colorScheme = if (darkTheme) DarkColorScheme else LightColorScheme

    MaterialTheme(
        colorScheme = colorScheme,
        typography = Typography,
        content = content
    )
}
