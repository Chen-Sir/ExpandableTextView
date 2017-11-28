# ExpandableTextView

<font size=8>The project is no longer maintained!</font>

ExpandableTextView library is a similar copy of [ExpandableTextView](https://github.com/Manabu-GT/ExpandableTextView) by [Manabu Shimobe](https://github.com/Manabu-GT) , but change a little UI structure and improve the code to make it easier to use. 

 ![sample](/art/sample.gif)



## Setup

Download the library module and add it to your project.



## Usage

Using the library is very simple, look at the source code of the [provided sample](/sample). 

#### Step 1. In your layout xml：

```xml
<me.chensir.expandabletextview.ExpandableTextView
    android:id="@+id/tv"
    android:layout_width="match_parent"
    android:layout_height="wrap_content"
    app:contentTextColor="@color/colorPrimary"
    app:maxCollapsedLines="4">

</me.chensir.expandabletextview.ExpandableTextView>
```

#### Step 2.  In your activity：

```java
((ExpandableTextView) findViewById(R.id.tv)).setText(getString(R.string.dummy_text));
```

**Just so !**

Also ,  you can optionally set the following attributes in your layout xml file to customize the behavior of the ExpandableTextView.

- `maxCollapsedLines` (defaults to 8) The maximum number of text lines allowed to be shown when the TextView gets collapsed
- `animDuration` (defaults to 300ms) Duration of the Animation for the expansion/collapse
- `expandDrawable` Customize a drawable set to ImageButton to expand the TextView
- `collapseDrawable` Customize a drawable set to ImageButton to collapse the TextView
- `contentTextSize`  Customize the text size of content
- `contentTextColor`  Customize the text color of content
- `expandText`  Customize the text  for `expandDrawable` 
- `collapseText`  Customize the text  for `collapseDrawable`
- `expandCollapseTextColor`  Customize the text color for `expandText`  and `collapseText`
- `DrawableAndTextGravity`  Customize the gravity of `expandDrawable`  and  `collapseDrawable`  below the content
- `contentLineSpacingMultiplier`  Sets line spacing multiplier for the content text




## Thanks

[Manabu Shimobe / ExpandableTextView](https://github.com/Manabu-GT/ExpandableTextView)



License
-------

    Copyright 2016 Chen Sir.

    Licensed under the Apache License, Version 2.0 (the "License");
    you may not use this file except in compliance with the License.
    You may obtain a copy of the License at
    
       http://www.apache.org/licenses/LICENSE-2.0
    
    Unless required by applicable law or agreed to in writing, software
    distributed under the License is distributed on an "AS IS" BASIS,
    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    See the License for the specific language governing permissions and
    limitations under the License.
