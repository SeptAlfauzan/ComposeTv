package com.techlads.composetv.home

import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.wrapContentWidth
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.techlads.composetv.home.navigation.NestedHomeNavigation
import com.techlads.composetv.leftmenu.LeftMenu

@Composable
fun HomeScreenContent() {
   Row {
       LeftMenu(modifier = Modifier.wrapContentWidth(), defaultFocus = 0, menuItems = MenuData.menuItems) {}
       NestedHomeNavigation()
   }
}

@Preview
@Composable
fun HomeScreenContentPrev() {
    HomeScreenContent()
}