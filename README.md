# ListViewWithFixedHeaderAndFooter
A small working application that shows a simple ListView with fixed header and footer.
It is designed using a relative layout.

#### A fixed header in the form of TextView 
 <TextView
            android:id="@+id/textView"
            android:layout_width="match_parent"
            android:layout_height="wrap_content"
            android:layout_alignParentTop="true"
            android:layout_centerHorizontal="true"
            android:text="hello i m header"
            android:textAlignment="center"
            android:textColor="@color/colorPrimaryDark"
            android:textSize="18sp"
            android:textStyle="bold" />
            
#### A ListView in between

<ListView
            android:id="@+id/myListView"
            android:layout_width="match_parent"
            android:layout_height="match_parent"
            android:layout_above="@+id/textView2"
            android:layout_below="@+id/textView"
            android:headerDividersEnabled="false" />
            
The thing which makes the header and footer fixed is:
            android:layout_above="@+id/textView2"
            android:layout_below="@+id/textView"
These two properties of ListView keeps it sandwiched between the two TextViews.
            
            
#### Again a fixed footer in form of TextView.

<TextView
            android:id="@+id/textView2"
            android:layout_width="match_parent"
            android:layout_height="wrap_content"
            android:layout_alignParentBottom="true"
            android:layout_alignParentLeft="true"
            android:layout_alignParentStart="true"
            android:text="hello i m footer"
            android:textAlignment="center"
            android:textColor="@color/colorPrimaryDark"
            android:textSize="18sp"
            android:textStyle="bold" />
