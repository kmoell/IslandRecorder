package com.island.recorder.ui.theme

import androidx.compose.ui.graphics.Color
import top.yukonga.miuix.kmp.theme.Colors
import top.yukonga.miuix.kmp.theme.darkColorScheme
import top.yukonga.miuix.kmp.theme.lightColorScheme

// ─── ColorOS (OPPO) style palette ────────────────────────────────────────────
// Green accent, cooler surfaces, softer outlines — OPPO/ColorOS visual language.

val OPPOGreen = Color(0xFF00A650)
val OPPOGreenLight = Color(0xFF16A34A)   // accent on white (keeps contrast)
val OPPOGreenDark = Color(0xFF4ADE80)    // accent in dark mode
val OPPODeepOnGreen = Color(0xFF06140B)  // text on bright green buttons (dark)
val RecordingRed = Color(0xFFFF3B30)

private val ColorOSSurfaceLight = Color(0xFFF4F5F7)
private val ColorOSOutlineLight = Color(0xFFE4E6EA)
private val ColorOSDividerLight = Color(0xFFE9EBEE)

private val ColorOSBgDark = Color(0xFF121212)
private val ColorOSCardDark = Color(0xFF1E1E1E)
private val ColorOSCardHighDark = Color(0xFF2A2A2A)
private val ColorOSOutlineDark = Color(0xFF333333)
private val ColorOSDividerDark = Color(0xFF2A2A2A)

fun colorosLightColors(): Colors = lightColorScheme(
    primary = OPPOGreenLight,
    onPrimary = Color.White,
    primaryVariant = OPPOGreenLight,
    onPrimaryVariant = Color(0xFFB7F5D0),
    disabledPrimary = Color(0xFFB4EBCB),
    disabledOnPrimary = Color(0xFFF0FBF4),
    disabledPrimaryButton = Color(0xFFB4EBCB),
    disabledOnPrimaryButton = Color.White,
    disabledPrimarySlider = Color(0xFFA9DCC0),
    primaryContainer = OPPOGreenLight,
    onPrimaryContainer = Color.White,
    secondary = Color(0xFFF0F0F0),
    onSecondary = Color.White,
    secondaryVariant = Color(0xFFF0F0F0),
    onSecondaryVariant = Color(0xFF303030),
    secondaryContainer = Color(0xFFF0F0F0),
    onSecondaryContainer = Color(0xFF9AA0AA),
    tertiaryContainer = Color(0xFFE7F8EE),
    onTertiaryContainer = OPPOGreenLight,
    tertiaryContainerVariant = Color(0xFFE7F8EE),
    background = Color.White,
    onBackground = Color(0xFF111111),
    onBackgroundVariant = Color(0xFF8A8F99),
    surface = ColorOSSurfaceLight,
    onSurface = Color(0xFF111111),
    surfaceVariant = Color.White,
    onSurfaceSecondary = Color(0xCC111111),
    onSurfaceVariantSummary = Color(0x99111111),
    onSurfaceVariantActions = Color(0x66111111),
    surfaceContainer = Color.White,
    onSurfaceContainer = Color(0xFF111111),
    onSurfaceContainerVariant = Color(0xFF9AA0AA),
    surfaceContainerHigh = Color(0xFFF0F1F3),
    onSurfaceContainerHigh = Color(0xFF8A8F99),
    surfaceContainerHighest = Color(0xFFF0F1F3),
    onSurfaceContainerHighest = Color(0xFF111111),
    outline = ColorOSOutlineLight,
    dividerLine = ColorOSDividerLight,
    windowDimming = Color.Black.copy(alpha = 0.35f),
    sliderKeyPointForeground = OPPOGreenLight,
)

fun colorosDarkColors(): Colors = darkColorScheme(
    primary = OPPOGreenDark,
    onPrimary = OPPODeepOnGreen,
    primaryVariant = OPPOGreenDark,
    onPrimaryVariant = Color(0xFF0C3A20),
    disabledPrimary = Color(0xFF14532D),
    disabledOnPrimary = Color(0xFF1E2A23),
    disabledPrimaryButton = Color(0xFF14532D),
    disabledOnPrimaryButton = Color(0xFF1E2A23),
    disabledPrimarySlider = Color(0xFF1B4A2C),
    primaryContainer = OPPOGreenDark,
    onPrimaryContainer = OPPODeepOnGreen,
    secondary = Color(0xFF2A2A2A),
    onSecondary = Color.White,
    secondaryVariant = Color(0xFF2A2A2A),
    onSecondaryVariant = Color(0xFFD9D9D9),
    secondaryContainer = Color(0xFF2A2A2A),
    onSecondaryContainer = Color(0xFF9E9EA3),
    tertiaryContainer = Color(0xFF123324),
    onTertiaryContainer = OPPOGreenDark,
    tertiaryContainerVariant = Color(0xFF123324),
    background = ColorOSBgDark,
    onBackground = Color(0xFFF2F2F2),
    onBackgroundVariant = Color(0xFF8E8E93),
    surface = ColorOSBgDark,
    onSurface = Color(0xFFF2F2F2),
    surfaceVariant = ColorOSCardDark,
    onSurfaceSecondary = Color(0xCCF2F2F2),
    onSurfaceVariantSummary = Color(0x99F2F2F2),
    onSurfaceVariantActions = Color(0x66F2F2F2),
    surfaceContainer = ColorOSCardDark,
    onSurfaceContainer = Color(0xFFF2F2F2),
    onSurfaceContainerVariant = Color(0xFF9E9EA3),
    surfaceContainerHigh = ColorOSCardHighDark,
    onSurfaceContainerHigh = Color(0xFF9E9EA3),
    surfaceContainerHighest = ColorOSCardHighDark,
    onSurfaceContainerHighest = Color(0xFFF2F2F2),
    outline = ColorOSOutlineDark,
    dividerLine = ColorOSDividerDark,
    windowDimming = Color.Black.copy(alpha = 0.45f),
    sliderKeyPointForeground = OPPOGreenDark,
)
