# Git & GitHub Guide

## 📌 Introduction
Git is a distributed version control system that helps developers track changes in their codebase. GitHub is a cloud-based hosting service for Git repositories that facilitates collaboration and project management.

## 📂 Basic Git Commands

| Command | Description |
|---------|-------------|
| `git init` | Initialize a new Git repository |
| `git clone <repo_url>` | Clone an existing repository |
| `git status` | Check the status of the repository |
| `git add <file>` | Stage a file for commit |
| `git add .` | Stage all changes |
| `git commit -m "message"` | Commit staged changes |
| `git push origin <branch>` | Push changes to remote repository |
| `git pull origin <branch>` | Pull latest changes from remote |
| `git branch` | List all branches |
| `git checkout <branch>` | Switch to another branch |
| `git merge <branch>` | Merge a branch into the current branch |
| `git branch -d <branch>` | Delete a local branch |
| `git push origin --delete <branch>` | Delete a remote branch |

## 🔄 Working with Branches

```sh
# Create a new branch
git branch <branch-name>

# Switch to the new branch
git checkout <branch-name>

# Create and switch to a new branch
git checkout -b <branch-name>

# Push a branch to GitHub
git push origin <branch-name>
```

## 🔄 Undoing Changes

```sh
# Undo changes in the working directory
git checkout -- <file>

# Unstage a file (keep changes)
git reset HEAD <file>

# Revert the last commit (keep changes)
git reset --soft HEAD~1

# Revert the last commit (discard changes)
git reset --hard HEAD~1
```

## 🔁 Git Merge vs Rebase

- **Merge**: Combines two branches and creates a new commit.
- **Rebase**: Moves a branch to a new base commit, keeping a linear history.

```sh
# Merge feature branch into main
git checkout main
git merge feature-branch

# Rebase feature branch onto main
git checkout feature-branch
git rebase main
```

## 📌 Working with Remote Repositories

```sh
# Add a remote repository
git remote add origin <repo_url>

# View remote repositories
git remote -v

# Change the URL of the remote repository
git remote set-url origin <new_url>
```

## 🛠️ GitHub Workflow Example

```sh
# Clone the repository
git clone <repo_url>

# Create a new branch
git checkout -b feature-branch

# Make changes and commit
git add .
git commit -m "Added new feature"

# Push to GitHub
git push origin feature-branch

# Create a Pull Request (PR) on GitHub
```

## 📜 Git Ignore & .gitignore
Use `.gitignore` to exclude files from version control.

```
# Ignore compiled files
*.class

# Ignore logs and temp files
*.log
temp/
```

## 🏆 Best Practices
1. **Commit Often**: Make small, frequent commits.
2. **Write Meaningful Commit Messages**: Describe what changed.
3. **Use Branches**: Keep features separate.
4. **Pull Before Pushing**: Always sync before pushing.
5. **Review Code Before Merging**: Use pull requests and code reviews.

## 🔗 Resources
- [Git Documentation](https://git-scm.com/doc)
- [GitHub Guides](https://docs.github.com/en)
- [Learn Git Interactive](https://learngitbranching.js.org/)

---
🚀 Happy Coding! 🎯