package dev.andrericardo.apprepositoriesgithub_kotlinandroid.data.repositories

import dev.andrericardo.apprepositoriesgithub_kotlinandroid.data.model.Repo
import kotlinx.coroutines.flow.Flow

interface RepoRepository {
    suspend fun listRepositories(user: String): Flow<List<Repo>>
}