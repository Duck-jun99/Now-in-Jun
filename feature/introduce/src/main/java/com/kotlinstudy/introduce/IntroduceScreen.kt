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
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.asImageBitmap
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.AnnotatedString
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.bumptech.glide.Glide
import com.bumptech.glide.request.target.CustomTarget
import com.bumptech.glide.request.transition.Transition
import com.kotlinstudy.designsystem.CleanArchitectureTheme
import com.nowinjun.introduce.R

@Composable
fun IntroduceScreen(

    //viewModel: LoginViewModel = hiltViewModel()
) {
    //val emailState = viewModel.userEmail.value
    //val passwordState = viewModel.userPassword.value

    val snackBarHostState = remember { SnackbarHostState() }
    SnackbarHost(hostState = snackBarHostState)
    LaunchedEffect(key1 = true) {

        /*
        viewModel.eventFlow.collectLatest { event ->
            when (event) {
                is LoginViewModel.UiEvent.ShowSnackBar -> {
                    snackBarHostState.showSnackbar(
                        message = event.message
                    )
                }
                is LoginViewModel.UiEvent.Login -> {
                    snackBarHostState.showSnackbar(
                        message = "로그인을 성공했습니다."
                    )
                    TODO("로그인을 성공하고 난 이후의 처리")
                }
            }
        }

         */
    }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(20.dp)
    ) {
        Spacer(modifier = Modifier.height(100.dp))


        Spacer(modifier = Modifier.height(100.dp))
        Row(
            modifier = Modifier.fillMaxWidth(),
        ) {
            Text(
                text = AnnotatedString("Project"),
                style = MaterialTheme.typography.headlineLarge,
                color = Color.DarkGray
            )
            Text(
                text = "  /  ",
                style = MaterialTheme.typography.headlineLarge,
                color = Color.DarkGray,
            )
            Text(
                text = AnnotatedString("Setting"),
                style = MaterialTheme.typography.headlineLarge.copy(
                    color = Color.Gray
                ),
            )
        }

        /*
        Spacer(modifier = Modifier.height(30.dp))
        OutlinedTextField(
            value = emailState,
            label = { Text(text = "Email") },
            placeholder = { Text(text = "이메일을 입력해 주세요.") },
            onValueChange = { newValue ->
                viewModel.onEvent(LoginEvent.EnteredEmail(newValue))
            },
            modifier = Modifier.fillMaxWidth(),
            textStyle = MaterialTheme.typography.bodyLarge
        )
        Spacer(modifier = Modifier.height(15.dp))
        OutlinedTextField(
            value = passwordState,
            label = { Text(text = "Password") },
            placeholder = { Text(text = "비밀번호를 입력해 주세요") },
            onValueChange = { newValue ->
                viewModel.onEvent(LoginEvent.EnteredPassword(newValue))
            },
            modifier = Modifier.fillMaxWidth(),
            textStyle = MaterialTheme.typography.bodyLarge
        )
        Spacer(modifier = Modifier.height(15.dp))
        Button(
            onClick = {
                viewModel.onEvent(LoginEvent.Login)
            },
            modifier = Modifier.wrapContentSize().fillMaxWidth(),
            colors = ButtonDefaults.buttonColors(containerColor = Color.Blue),
            contentPadding = PaddingValues(15.dp),
            shape = RoundedCornerShape(4.dp)
        ) {
            Text(text = "Login", fontSize = 20.sp)
        }

         */
    }

}

@Composable
fun ProfileImage(source: String, modifier: Modifier = Modifier) {
    // image bitmap
    val bitmap: MutableState<Bitmap?> = remember { mutableStateOf(null) }
    val imageModifier: Modifier = modifier
        .size(50.dp, 50.dp)
        .clip(CircleShape)

    Glide.with(LocalContext.current)
        .asBitmap()
        .load(source)
        .into(object : CustomTarget<Bitmap>() {
            override fun onResourceReady(resource: Bitmap, transition: Transition<in Bitmap>?) {
                bitmap.value = resource
            }

            override fun onLoadCleared(placeholder: Drawable?) {}
        })

    // bitmap 이 있으면
    bitmap.value?.asImageBitmap()?.let { fetchedBitmap ->
        Image(
            bitmap = fetchedBitmap,
            contentDescription = null,
            contentScale = ContentScale.Fit,
            modifier = imageModifier
        )
    } ?: Image(
        painter = painterResource(id = R.drawable.me),
        contentDescription = null,
        contentScale = ContentScale.Fit,
        modifier = imageModifier
    )
}

@Preview(showBackground = true)
@Composable
fun IntroducePreview() {
    IntroduceScreen()
}