package com.kotlinstudy.project;

import androidx.lifecycle.ViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class ProjectViewModel @Inject constructor(
        //private val loginUseCase: LoginUsecase
) : ViewModel() {

        /*
        private val _userEmail = mutableStateOf("")
        val userEmail: State<String> = _userEmail

        private val _userPassword = mutableStateOf("")
        val userPassword: State<String> = _userPassword

        private val _eventFlow = MutableSharedFlow<UiEvent>()
        val eventFlow = _eventFlow.asSharedFlow()

        fun onEvent(event: LoginEvent) {
                when (event) {
                        is LoginEvent.EnteredEmail -> {
                                _userEmail.value = event.value
                        }
                        is LoginEvent.EnteredPassword -> {
                                _userPassword.value = event.value
                        }
                        is LoginEvent.Login -> {
                                viewModelScope.launch {
                                        try {
                                                loginUseCase(
                                                        User(
                                                                email = userEmail.value,
                                                                password = userPassword.value
                                                        )
                                                )
                                                _eventFlow.emit(UiEvent.Login)
                                        } catch (e: InvalidUserException) {
                                                _eventFlow.emit(
                                                        UiEvent.ShowSnackBar(
                                                                message = e.message ?: "로그인할 수 없습니다."
                                                        )
                                                )
                                        }
                                }
                        }
                }
        }

        sealed class UiEvent {
                data class ShowSnackBar(val message: String) : UiEvent()
                object Login : UiEvent()
        }

         */
}