**Git & GitHub Notes**

---

## 1️⃣ What is Git?
- Git is a **version control system** that helps track changes in code.
- It allows multiple developers to collaborate on a project.
- Stores project history and makes it easy to revert to previous versions.

## 2️⃣ What is GitHub?
- GitHub is a **cloud-based platform** for hosting Git repositories.
- It provides tools for collaboration, issue tracking, and code review.
- Allows developers to work on projects remotely and contribute to open-source.

---

## 3️⃣ Git Commands 🔥
### ✅ Basic Git Commands
- `git init` → Initialize a new repository.
- `git clone <repo_url>` → Clone an existing repository.
- `git status` → Check the status of changes.
- `git add <file>` → Stage a file for commit.
- `git commit -m "commit message"` → Save changes.
- `git push origin main` → Push changes to the remote repository.
- `git pull origin main` → Get the latest changes from remote.

### ✅ Branching in Git 🌿
- `git branch` → List all branches.
- `git branch <branch_name>` → Create a new branch.
- `git checkout <branch_name>` → Switch to a branch.
- `git checkout -b <branch_name>` → Create & switch to a new branch.
- `git merge <branch_name>` → Merge a branch into the current branch.
- `git branch -d <branch_name>` → Delete a branch.

### ✅ Undo & Reset Changes 🔄
- `git reset --hard HEAD~1` → Undo last commit (permanently).
- `git revert <commit_hash>` → Undo a commit (keeps history).
- `git stash` → Save uncommitted changes temporarily.
- `git stash pop` → Apply stashed changes back.

---

## 4️⃣ Standard Commit Message Format 📝
Use a structured format:  
**`[sujoy]desc: commit description`**

Example:
```
[sujoy]fix: fixed a bug in login page
[sujoy]feat: added a new dashboard
[sujoy]mod: modified user profile UI
```

---

## 5️⃣ Git Push vs Pull vs Clone vs Fetch vs Fork 🤔

| Command  | Description |
|----------|-------------|
| `git push` | Send local commits to the remote repo. |
| `git pull` | Fetch latest changes and merge into local repo. |
| `git clone` | Copy a remote repository to your local machine. |
| `git fetch` | Fetch changes from remote but don’t merge. |
| `git fork` | Copy someone else's repo to your GitHub account. |

---

## 6️⃣ How to Push Code to GitHub 🚀
1. **Initialize Git** (if not already initialized)
   ```sh
   git init
   ```
2. **Connect to Remote Repository**
   ```sh
   git remote add origin <repo_url>
   ```
3. **Add & Commit Changes**
   ```sh
   git add .
   git commit -m "[sujoy]feat: added new feature"
   ```
4. **Push to GitHub**
   ```sh
   git push origin main
   ```

---

## 7️⃣ How to Pull Latest Code 🛠️
```sh
git pull origin main
```
This will fetch and merge the latest changes from GitHub.

---

## 8️⃣ How to Fork & Contribute to Open Source 🌍
1. **Fork a repository** → Click the Fork button on GitHub.
2. **Clone your fork**
   ```sh
   git clone <your_forked_repo_url>
   ```
3. **Create a new branch**
   ```sh
   git checkout -b feature_branch
   ```
4. **Make changes & push**
   ```sh
   git add .
   git commit -m "[sujoy]feat: added new feature"
   git push origin feature_branch
   ```
5. **Create a Pull Request (PR)** → Open a PR on GitHub.

---

## 🎯 Summary
- **Git** → Version control system for tracking changes.
- **GitHub** → Cloud platform for hosting repositories.
- **Important Commands** → `git clone`, `git push`, `git pull`, `git merge`.
- **Commit Format** → `[sujoy]desc: message`.
- **Push Code to GitHub** → Add, commit, and push.
- **Fork & Contribute** → Fork → Clone → Modify → PR.

🚀 **Now you're ready to use Git & GitHub like a pro!** 😎