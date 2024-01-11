package com.ericg.neatflix.viewmodel

import androidx.lifecycle.ViewModel
import com.ericg.neatflix.data.repository.FilmRepository
import com.hadiyarajesh.composegoogle.model.User
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import javax.inject.Inject

@HiltViewModel class AuthViewModel @Inject constructor(): ViewModel() {
    private val _user: MutableStateFlow<User?> = MutableStateFlow(null)
    val user: StateFlow<User?> = _user

    suspend fun signIn(email: String, displayName: String) {
        delay(2000) // Simulating network call
        _user.value = User(email, displayName)
    }
}