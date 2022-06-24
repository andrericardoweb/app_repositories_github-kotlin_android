package dev.andrericardo.apprepositoriesgithub_kotlinandroid.domain

import dev.andrericardo.apprepositoriesgithub_kotlinandroid.core.UseCase
import dev.andrericardo.apprepositoriesgithub_kotlinandroid.data.model.Repo
import dev.andrericardo.apprepositoriesgithub_kotlinandroid.data.repositories.RepoRepository
import kotlinx.coroutines.flow.Flow

class ListUserRepositoriesUseCase(
    private val repository: RepoRepository
) : UseCase<String, List<Repo>>() {

    override suspend fun execute(param: String): Flow<List<Repo>> {
        return repository.listRepositories(param)
    }
}