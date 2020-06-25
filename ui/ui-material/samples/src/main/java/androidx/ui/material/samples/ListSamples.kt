/*
 * Copyright 2019 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package androidx.ui.material.samples

import androidx.annotation.Sampled
import androidx.compose.Composable
import androidx.compose.getValue
import androidx.compose.setValue
import androidx.compose.state
import androidx.ui.foundation.Icon
import androidx.ui.foundation.Image
import androidx.ui.foundation.Text
import androidx.ui.foundation.contentColor
import androidx.ui.graphics.ColorFilter
import androidx.ui.graphics.ImageAsset
import androidx.ui.graphics.vector.VectorAsset
import androidx.ui.layout.Column
import androidx.ui.material.Checkbox
import androidx.ui.material.Divider
import androidx.ui.material.ListItem

@Sampled
@Composable
fun OneLineListItems(
    icon24x24: ImageAsset,
    icon40x40: ImageAsset,
    icon56x56: ImageAsset,
    vectorIcon: VectorAsset
) {
    Column {
        ListItem(text = { Text("One line list item with no icon") })
        Divider()
        ListItem(
            text = { Text("פריט ברשימה אחת עם תמונה.") },
            icon = { Image(icon24x24, colorFilter = ColorFilter.tint(contentColor())) }
        )
        Divider()
        ListItem(
            text = { Text("One line list item with 24x24 icon") },
            icon = { Image(icon24x24, colorFilter = ColorFilter.tint(contentColor())) }
        )
        Divider()
        ListItem(
            text = { Text("One line list item with 40x40 icon") },
            icon = { Image(icon40x40, colorFilter = ColorFilter.tint(contentColor())) }
        )
        Divider()
        ListItem(
            text = { Text("One line list item with 56x56 icon") },
            icon = { Image(icon56x56, colorFilter = ColorFilter.tint(contentColor())) }
        )
        Divider()
        ListItem(
            text = { Text("One line clickable list item") },
            icon = { Image(icon56x56, colorFilter = ColorFilter.tint(contentColor())) },
            onClick = {}
        )
        Divider()
        ListItem(
            text = { Text("One line list item with trailing icon") },
            trailing = { Icon(vectorIcon) }
        )
        Divider()
        ListItem(
            text = { Text("One line list item") },
            icon = { Image(icon40x40, colorFilter = ColorFilter.tint(contentColor())) },
            trailing = { Icon(vectorIcon) }
        )
        Divider()
    }
}

@Sampled
@Composable
// TODO(popam, b/159689286): material icons instead of ImageAsset when they can have custom sizes
fun TwoLineListItems(icon24x24: ImageAsset, icon40x40: ImageAsset) {
    Column {
        ListItem(
            text = { Text("Two line list item") },
            secondaryText = { Text("Secondary text") }
        )
        Divider()
        ListItem(
            text = { Text("Two line list item") },
            overlineText = { Text("OVERLINE") }
        )
        Divider()
        ListItem(
            text = { Text("Two line list item with 24x24 icon") },
            secondaryText = { Text("Secondary text") },
            icon = { Image(icon24x24, colorFilter = ColorFilter.tint(contentColor())) }
        )
        Divider()
        ListItem(
            text = { Text("Two line list item with 40x40 icon") },
            secondaryText = { Text("Secondary text") },
            icon = { Image(icon40x40, colorFilter = ColorFilter.tint(contentColor())) }
        )
        Divider()
        ListItem(
            text = { Text("Two line list item with 40x40 icon") },
            secondaryText = { Text("Secondary text") },
            trailing = { Text("meta") },
            icon = { Image(icon40x40, colorFilter = ColorFilter.tint(contentColor())) }
        )
        Divider()
        var checked by state { false }
        ListItem(
            text = { Text("Two line list item") },
            secondaryText = { Text("Secondary text") },
            icon = { Image(icon40x40, colorFilter = ColorFilter.tint(contentColor())) },
            trailing = {
                Checkbox(checked, onCheckedChange = { checked = !checked })
            }
        )
        Divider()
    }
}

@Sampled
@Composable
fun ThreeLineListItems(icon24x24: ImageAsset, vectorIcon: VectorAsset) {
    Column {
        ListItem(
            text = { Text("Three line list item") },
            secondaryText = {
                Text(
                    "This is a long secondary text for the current list item, " +
                            "displayed on two lines"
                )
            },
            singleLineSecondaryText = false,
            trailing = { Text("meta") }
        )
        Divider()
        ListItem(
            text = { Text("Three line list item") },
            overlineText = { Text("OVERLINE") },
            secondaryText = { Text("Secondary text") }
        )
        Divider()
        ListItem(
            text = { Text("Three line list item with 24x24 icon") },
            secondaryText = {
                Text(
                    "This is a long secondary text for the current list item " +
                            "displayed on two lines"
                )
            },
            singleLineSecondaryText = false,
            icon = { Image(icon24x24, colorFilter = ColorFilter.tint(contentColor())) }
        )
        Divider()
        ListItem(
            text = { Text("Three line list item with trailing icon") },
            secondaryText = {
                Text(
                    "This is a long secondary text for the current list" +
                            " item, displayed on two lines"
                )
            },
            singleLineSecondaryText = false,
            trailing = { Icon(vectorIcon) }
        )
        Divider()
        ListItem(
            text = { Text("Three line list item") },
            overlineText = { Text("OVERLINE") },
            secondaryText = { Text("Secondary text") },
            trailing = { Text("meta") }
        )
        Divider()
    }
}
