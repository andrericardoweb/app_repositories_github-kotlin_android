package dev.andrericardo.apprepositoriesgithub_kotlinandroid.data.services

import dev.andrericardo.apprepositoriesgithub_kotlinandroid.data.model.Repo
import retrofit2.http.GET
import retrofit2.http.Path

interface GitHubService {
    @GET("users/{user}/repos")
    suspend fun listRepositories(@Path("user") user: String) : List<Repo>
}