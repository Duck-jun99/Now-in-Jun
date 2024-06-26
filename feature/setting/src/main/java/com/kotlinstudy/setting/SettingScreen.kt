package com.kotlinstudy.setting

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.text.ClickableText
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.SnackbarHost
import androidx.compose.material3.SnackbarHostState
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.AnnotatedString
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun SettingScreen(
    //onProjectClick: (Int) -> Unit,
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
        Text(
            text = "설정 화면",
            style = MaterialTheme.typography.displayMedium,
            color = Color.Blue,
            fontWeight = FontWeight.Bold
        )
        Spacer(modifier = Modifier.height(20.dp))
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

@Preview
@Composable
fun SettingPreview(){
    SettingScreen()
}