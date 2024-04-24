package com.kotlinstudy.introduce

import android.graphics.Bitmap
import android.graphics.drawable.Drawable
import android.provider.Settings.Global.getString
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.text.ClickableText
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.SnackbarHost
import androidx.compose.material3.SnackbarHostState
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.asImageBitmap
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.AnnotatedString
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.hilt.navigation.compose.hiltViewModel
import com.bumptech.glide.Glide
import com.bumptech.glide.load.resource.bitmap.CenterInside
import com.bumptech.glide.request.target.CustomTarget
import com.bumptech.glide.request.transition.Transition
import com.kotlinstudy.designsystem.CleanArchitectureTheme
import com.nowinjun.introduce.R

@Composable
fun IntroduceScreen(
    viewModel: IntroduceViewModel = hiltViewModel()
) {

    val snackBarHostState = remember { SnackbarHostState() }
    SnackbarHost(hostState = snackBarHostState)
    LaunchedEffect(key1 = true) {

    }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(20.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Spacer(modifier = Modifier.height(30.dp))

        ProfileImage(imageResource = R.drawable.me, modifier = Modifier)

        Spacer(modifier = Modifier.height(30.dp))

        IntroduceText()

    }

}

@Composable
fun ProfileImage(imageResource: Int, modifier: Modifier = Modifier) {
    // image bitmap
    val bitmap: MutableState<Bitmap?> = remember { mutableStateOf(null) }
    val imageModifier: Modifier = modifier
        .size(150.dp, 150.dp)
        .clip(CircleShape)
        .fillMaxSize()

    Glide.with(LocalContext.current)
        .asBitmap()
        .load(imageResource)
        .into(object : CustomTarget<Bitmap>() {
            override fun onResourceReady(resource: Bitmap, transition: Transition<in Bitmap>?) {
                bitmap.value = resource
            }

            override fun onLoadCleared(placeholder: Drawable?) {}
        })

    bitmap.value?.asImageBitmap()?.let { fetchedBitmap ->
        Image(
            bitmap = fetchedBitmap,
            contentDescription = null,
            contentScale = ContentScale.FillWidth,
            modifier = imageModifier
        )   //bitmap이 없다면
    } ?: Image(
        painter = painterResource(id = R.drawable.me),
        contentDescription = null,
        contentScale = ContentScale.FillWidth,
        modifier = imageModifier
    )
}

@Composable
fun IntroduceText(){

    Column (
        modifier = Modifier.fillMaxSize()
    ){
        Text(
            text = stringResource(id = R.string.introMySelf),
            style = MaterialTheme.typography.bodyMedium,
            color = Color.DarkGray
        )

        Spacer(modifier = Modifier.height(30.dp))

        Text(
            text = stringResource(id = R.string.stack),
            style = MaterialTheme.typography.bodyMedium,
            color = Color.DarkGray
        )

        Row(
            modifier = Modifier.fillMaxWidth()
        ){
            Text(
                text = AnnotatedString("Kotlin  "),
                style = MaterialTheme.typography.bodyMedium,
                color = Color.DarkGray
            )
            Text(
                text = AnnotatedString("Java  "),
                style = MaterialTheme.typography.bodyMedium,
                color = Color.DarkGray
            )
            Text(
                text = AnnotatedString("Android"),
                style = MaterialTheme.typography.bodyMedium,
                color = Color.DarkGray
            )
        }
    }

}

@Preview(showBackground = true)
@Composable
fun IntroducePreview() {


    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(20.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Spacer(modifier = Modifier.height(30.dp))

        //Start: Preview를 위해 Glide를 뺌.

        val imageModifier: Modifier = Modifier
            .size(150.dp, 150.dp)
            .clip(CircleShape)
            .fillMaxSize()

        Image(
            painter = painterResource(id = R.drawable.me),
            contentDescription = null,
            contentScale = ContentScale.FillWidth,
            modifier = imageModifier
        )

        //End

        Spacer(modifier = Modifier.height(30.dp))

        IntroduceText()
    }
}