package com.tochukwu.cardinfofinder

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}



/**

<fragment
android:id="@+id/homeFragment"
android:name="com.tochukwu.cardinfofinder.ui.homeFragment.HomeFragment"
android:label="Home"
tools:layout="@layout/home_fragment">
<action
android:id="@+id/action_homeFragment_to_inputFragment"
app:destination="@id/inputFragment"
app:enterAnim="@anim/fade_in"
app:exitAnim="@anim/fade_out"
app:popEnterAnim="@anim/fade_in"
app:popExitAnim="@anim/fade_out" />
<action
android:id="@+id/action_homeFragment_to_ocrFragment"
app:destination="@id/ocrFragment"
app:enterAnim="@anim/fade_in"
app:exitAnim="@anim/fade_out"
app:popEnterAnim="@anim/fade_in"
app:popExitAnim="@anim/fade_out"/>
</fragment>


<fragment
android:id="@+id/inputFragment"
tools:layout="@layout/input_card_details"
android:name="com.tochukwu.cardinfofinder.ui.inputFragment.InputFragment"
android:label="Input Card" >
<action
android:id="@+id/action_inputFragment_to_resultFragment"
app:destination="@id/resultFragment"
app:enterAnim="@anim/fade_in"
app:exitAnim="@anim/fade_out"
app:popEnterAnim="@anim/fade_in"
app:popExitAnim="@anim/fade_out"/>
</fragment>


<fragment
android:id="@+id/ocrFragment"
tools:layout="@layout/ocr_fragment"
android:name="com.tochukwu.cardinfofinder.ui.ocrFragment.OcrFragment"
android:label="Ocr" >
<action
android:id="@+id/action_ocrFragment_to_homeFragment"
app:destination="@id/homeFragment" />
<action
android:id="@+id/action_ocrFragment_to_resultFragment"
app:destination="@id/resultFragment"
app:enterAnim="@anim/fade_in"
app:exitAnim="@anim/fade_out"
app:popEnterAnim="@anim/fade_in"
app:popExitAnim="@anim/fade_out"/>
</fragment>



<fragment
android:id="@+id/resultFragment"
tools:layout="@layout/result_fragment"
android:name="com.tochukwu.cardinfofinder.ui.resultFragment.view.ResultFragment"
android:label="Card Information" >
<argument
android:name="cardNumber"
app:argType="integer" />
</fragment>

 **/