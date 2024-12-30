/**
 *  A composable function that displays a title above a list of items inside a card container. It includes the ability to show optional dividers between items.
 *
 * Copyright (C) 2024 Scribe
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <https://www.gnu.org/licenses/>.
 */
package be.scri.ui.common.components

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import be.scri.R
import be.scri.ui.models.ScribeItemList

@Composable
fun ItemCardContainerWithTitle(
    title: String,
    cardItemsList: ScribeItemList,
    modifier: Modifier = Modifier,
    isDivider: Boolean = false,
) {
    Column(
        modifier = modifier,
    ) {
        Text(
            text = title,
            color = colorResource(R.color.app_text_color),
            fontWeight = FontWeight.Bold,
            fontSize = 18.sp,
            modifier =
                Modifier.padding(
                    start = 16.dp,
                    top = 16.dp,
                    bottom = 10.dp,
                ),
        )

        ItemsCardContainer(
            cardItemsList = cardItemsList,
            isDivider = isDivider,
            modifier =
                Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 12.dp),
        )
    }
}
