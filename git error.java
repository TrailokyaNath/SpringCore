
ADMIN@KARTHIKIT MINGW64 ~
$ pwd
/c/Users/ADMIN

ADMIN@KARTHIKIT MINGW64 ~
$ git status
fatal: Not a git repository (or any of the parent directories): .git

ADMIN@KARTHIKIT MINGW64 ~
$ mkdir sunil

ADMIN@KARTHIKIT MINGW64 ~
$ cd sunil

ADMIN@KARTHIKIT MINGW64 ~/sunil
$ git init
Initialized empty Git repository in C:/Users/ADMIN/sunil/.git/

ADMIN@KARTHIKIT MINGW64 ~/sunil (master)
$ git remote  origin  https://github.com/kaushalkbca15/JavaMail.git
error: Unknown subcommand: origin
usage: git remote [-v | --verbose]
   or: git remote add [-t <branch>] [-m <master>] [-f] [--tags | --no-tags] [--mirror=<fetch|push>] <name> <url>
   or: git remote rename <old> <new>
   or: git remote remove <name>
   or: git remote set-head <name> (-a | --auto | -d | --delete | <branch>)
   or: git remote [-v | --verbose] show [-n] <name>
   or: git remote prune [-n | --dry-run] <name>
   or: git remote [-v | --verbose] update [-p | --prune] [(<group> | <remote>)...]
   or: git remote set-branches [--add] <name> <branch>...
   or: git remote get-url [--push] [--all] <name>
   or: git remote set-url [--push] <name> <newurl> [<oldurl>]
   or: git remote set-url --add <name> <newurl>
   or: git remote set-url --delete <name> <url>

    -v, --verbose         be verbose; must be placed before a subcommand


ADMIN@KARTHIKIT MINGW64 ~/sunil (master)
$ git remote  add origin  https://github.com/kaushalkbca15/JavaMail.git

ADMIN@KARTHIKIT MINGW64 ~/sunil (master)
$


ADMIN@KARTHIKIT MINGW64 ~/sunil (master)
$

ADMIN@KARTHIKIT MINGW64 ~/sunil (master)
$ cd ..

ADMIN@KARTHIKIT MINGW64 ~
$ mkdir sunil1

ADMIN@KARTHIKIT MINGW64 ~
$ cd sunil1

ADMIN@KARTHIKIT MINGW64 ~/sunil1
$ git clone  https://github.com/kaushalkbca15/JavaMail.git
Cloning into 'JavaMail'...
remote: Counting objects: 244, done.
remote: Compressing objects: 100% (180/180), done.
remote: Total 244 (delta 48), reused 209 (delta 19), pack-reused 0
Receiving objects: 100% (244/244), 42.93 KiB | 244.00 KiB/s, done.
Resolving deltas: 100% (48/48), done.

ADMIN@KARTHIKIT MINGW64 ~/sunil1
$ cd JavaMail/

ADMIN@KARTHIKIT MINGW64 ~/sunil1/JavaMail (master)
$ ls -l
total 9
drwxr-xr-x 1 ADMIN 197121  0 Feb  9 13:32 JavaMailApp/
-rw-r--r-- 1 ADMIN 197121 37 Feb  9 13:32 README.md
drwxr-xr-x 1 ADMIN 197121  0 Feb  9 13:32 RegistetionFormWithPhoto/
drwxr-xr-x 1 ADMIN 197121  0 Feb  9 13:32 SpringSMSApp/

ADMIN@KARTHIKIT MINGW64 ~/sunil1/JavaMail (master)
$ cd SpringSMSApp/

ADMIN@KARTHIKIT MINGW64 ~/sunil1/JavaMail/SpringSMSApp (master)
$ dir

ADMIN@KARTHIKIT MINGW64 ~/sunil1/JavaMail/SpringSMSApp (master)
$ ls -l
total 0

ADMIN@KARTHIKIT MINGW64 ~/sunil1/JavaMail/SpringSMSApp (master)
$ cd ..

ADMIN@KARTHIKIT MINGW64 ~/sunil1/JavaMail (master)
$ cd ..

ADMIN@KARTHIKIT MINGW64 ~/sunil1
$ cd ..

ADMIN@KARTHIKIT MINGW64 ~
$ cd git
bash: cd: git: No such file or directory

ADMIN@KARTHIKIT MINGW64 ~
$ pwd
/c/Users/ADMIN

ADMIN@KARTHIKIT MINGW64 ~
$ d:
bash: d:: command not found

ADMIN@KARTHIKIT MINGW64 ~
$ cd d:

ADMIN@KARTHIKIT MINGW64 /d
$ pwd
/d

ADMIN@KARTHIKIT MINGW64 /d
$ cd  git

ADMIN@KARTHIKIT MINGW64 /d/git (master)
$ dir
ClientApp  JavaMailApp  Provider  README.md  RegistetionFormWithPhoto  SpringSMSApp

ADMIN@KARTHIKIT MINGW64 /d/git (master)
$ ls -l
total 1
drwxr-xr-x 1 ADMIN 197121  0 Feb  9 12:53 ClientApp/
drwxr-xr-x 1 ADMIN 197121  0 Feb  9 12:53 JavaMailApp/
drwxr-xr-x 1 ADMIN 197121  0 Feb  9 12:53 Provider/
-rw-r--r-- 1 ADMIN 197121 37 Feb  2 19:40 README.md
drwxr-xr-x 1 ADMIN 197121  0 Feb  9 13:24 RegistetionFormWithPhoto/
drwxr-xr-x 1 ADMIN 197121  0 Feb  9 12:53 SpringSMSApp/

ADMIN@KARTHIKIT MINGW64 /d/git (master)
$ git reflog
eb232ff (HEAD -> master, java/master) HEAD@{0}: commit: Form with photos
289e55a HEAD@{1}: commit (initial): this is java files

ADMIN@KARTHIKIT MINGW64 /d/git (master)
$ git log --oneline
eb232ff (HEAD -> master, java/master) Form with photos
289e55a this is java files

ADMIN@KARTHIKIT MINGW64 /d/git (master)
$ ls -la
total 57
drwxr-xr-x 1 ADMIN 197121  0 Feb  9 13:24 ./
drwxr-xr-x 1 ADMIN 197121  0 Feb  9 12:53 ../
drwxr-xr-x 1 ADMIN 197121  0 Feb  9 13:28 .git/
drwxr-xr-x 1 ADMIN 197121  0 Feb  9 12:53 .metadata/
drwxr-xr-x 1 ADMIN 197121  0 Feb  9 12:53 ClientApp/
drwxr-xr-x 1 ADMIN 197121  0 Feb  9 12:53 JavaMailApp/
drwxr-xr-x 1 ADMIN 197121  0 Feb  9 12:53 Provider/
-rw-r--r-- 1 ADMIN 197121 37 Feb  2 19:40 README.md
drwxr-xr-x 1 ADMIN 197121  0 Feb  9 13:24 RegistetionFormWithPhoto/
drwxr-xr-x 1 ADMIN 197121  0 Feb  9 12:53 SpringSMSApp/

ADMIN@KARTHIKIT MINGW64 /d/git (master)
$ cd .git

ADMIN@KARTHIKIT MINGW64 /d/git/.git (GIT_DIR!)
$ ls -l
total 38
-rw-r--r-- 1 ADMIN 197121    17 Feb  9 13:27 COMMIT_EDITMSG
-rw-r--r-- 1 ADMIN 197121   302 Feb  9 13:28 config
-rw-r--r-- 1 ADMIN 197121    73 Feb  9 12:53 description
-rw-r--r-- 1 ADMIN 197121   103 Feb  9 13:04 FETCH_HEAD
-rw-r--r-- 1 ADMIN 197121    23 Feb  9 12:53 HEAD
drwxr-xr-x 1 ADMIN 197121     0 Feb  9 12:53 hooks/
-rw-r--r-- 1 ADMIN 197121 11486 Feb  9 13:27 index
drwxr-xr-x 1 ADMIN 197121     0 Feb  9 12:53 info/
drwxr-xr-x 1 ADMIN 197121     0 Feb  9 13:02 logs/
drwxr-xr-x 1 ADMIN 197121     0 Feb  9 13:27 objects/
-rw-r--r-- 1 ADMIN 197121    41 Feb  9 13:04 ORIG_HEAD
drwxr-xr-x 1 ADMIN 197121     0 Feb  9 13:04 refs/

ADMIN@KARTHIKIT MINGW64 /d/git/.git (GIT_DIR!)
$ tree .
bash: tree: command not found

ADMIN@KARTHIKIT MINGW64 /d/git/.git (GIT_DIR!)
$ cd ..

ADMIN@KARTHIKIT MINGW64 /d/git (master)
$ git log --oneline
eb232ff (HEAD -> master, java/master) Form with photos
289e55a this is java files

ADMIN@KARTHIKIT MINGW64 /d/git (master)
$ cd ..

ADMIN@KARTHIKIT MINGW64 /d
$ cd newproject/

ADMIN@KARTHIKIT MINGW64 /d/newproject
$ dir
GitApps

ADMIN@KARTHIKIT MINGW64 /d/newproject
$ cd GitApps/

ADMIN@KARTHIKIT MINGW64 /d/newproject/GitApps (master)
$ ls -l
total 5
drwxr-xr-x 1 ADMIN 197121  0 Feb  9 13:38 ClientApp/
drwxr-xr-x 1 ADMIN 197121  0 Feb  9 13:38 JavaMailApp/
drwxr-xr-x 1 ADMIN 197121  0 Feb  9 13:38 PaginationApps/
drwxr-xr-x 1 ADMIN 197121  0 Feb  9 13:38 Provider/
-rw-r--r-- 1 ADMIN 197121 37 Feb  2 19:40 README.md
drwxr-xr-x 1 ADMIN 197121  0 Feb  9 13:38 SpringSMSApp/
drwxr-xr-x 1 ADMIN 197121  0 Feb  9 13:38 TestApp/

ADMIN@KARTHIKIT MINGW64 /d/newproject/GitApps (master)
$ ls -la
total 13
drwxr-xr-x 1 ADMIN 197121  0 Feb  9 13:38 ./
drwxr-xr-x 1 ADMIN 197121  0 Feb  9 13:38 ../
drwxr-xr-x 1 ADMIN 197121  0 Feb  9 13:38 .git/
drwxr-xr-x 1 ADMIN 197121  0 Feb  9 13:38 .metadata/
drwxr-xr-x 1 ADMIN 197121  0 Feb  9 13:38 ClientApp/
drwxr-xr-x 1 ADMIN 197121  0 Feb  9 13:38 JavaMailApp/
drwxr-xr-x 1 ADMIN 197121  0 Feb  9 13:38 PaginationApps/
drwxr-xr-x 1 ADMIN 197121  0 Feb  9 13:38 Provider/
-rw-r--r-- 1 ADMIN 197121 37 Feb  2 19:40 README.md
drwxr-xr-x 1 ADMIN 197121  0 Feb  9 13:38 SpringSMSApp/
drwxr-xr-x 1 ADMIN 197121  0 Feb  9 13:38 TestApp/

ADMIN@KARTHIKIT MINGW64 /d/newproject/GitApps (master)
$ rm -rf .git

ADMIN@KARTHIKIT MINGW64 /d/newproject/GitApps
$ git status
fatal: Not a git repository (or any of the parent directories): .git

ADMIN@KARTHIKIT MINGW64 /d/newproject/GitApps
$ git init
Initialized empty Git repository in D:/newproject/GitApps/.git/

ADMIN@KARTHIKIT MINGW64 /d/newproject/GitApps (master)
$ git remote add origin https://github.com/kaushalkbca15/newProject.git

ADMIN@KARTHIKIT MINGW64 /d/newproject/GitApps (master)
$


ADMIN@KARTHIKIT MINGW64 /d/newproject/GitApps (master)
$

ADMIN@KARTHIKIT MINGW64 /d/newproject/GitApps (master)
$ git add .
warning: adding embedded git repository: PaginationApps
hint: You've added another git repository inside your current repository.
hint: Clones of the outer repository will not contain the contents of
hint: the embedded repository and will not know how to obtain it.
hint: If you meant to add a submodule, use:
hint:
hint:   git submodule add <url> PaginationApps
hint:
hint: If you added this path by mistake, you can remove it from the
hint: index with:
hint:
hint:   git rm --cached PaginationApps
hint:
hint: See "git help submodule" for more information.
warning: adding embedded git repository: SpringSMSApp
warning: adding embedded git repository: TestApp

ADMIN@KARTHIKIT MINGW64 /d/newproject/GitApps (master)
$ find
.
./.git
./.git/config
./.git/description
./.git/HEAD
./
./ClientApp/target/classes/com/nt/service

./JavaMailApp/pom.xml
./JavaMailApp/src

./JavaMailApp/target/test-classes
./PaginationApps
./PaginationApps/.classpath


ADMIN@KARTHIKIT MINGW64 /d/newproject/GitApps (master)
$ rm -rf .git

ADMIN@KARTHIKIT MINGW64 /d/newproject/GitApps
$ find . -name  ".git" -type d
./PaginationApps/.git
./SpringSMSApp/.git
./TestApp/.git

ADMIN@KARTHIKIT MINGW64 /d/newproject/GitApps
$ rm -rf PaginationApps/.git

ADMIN@KARTHIKIT MINGW64 /d/newproject/GitApps
$ rm -rf SpringSMSApp/.git

ADMIN@KARTHIKIT MINGW64 /d/newproject/GitApps
$ rm -rf TestApp/.git

ADMIN@KARTHIKIT MINGW64 /d/newproject/GitApps
$


ADMIN@KARTHIKIT MINGW64 /d/newproject/GitApps
$


ADMIN@KARTHIKIT MINGW64 /d/newproject/GitApps
$
gi
ADMIN@KARTHIKIT MINGW64 /d/newproject/GitApps
$ git init
Initialized empty Git repository in D:/newproject/GitApps/.git/

ADMIN@KARTHIKIT MINGW64 /d/newproject/GitApps (master)
$ git remote add origin https://github.com/kaushalkbca15/newProject.git

ADMIN@KARTHIKIT MINGW64 /d/newproject/GitApps (master)
$ git add .

ADMIN@KARTHIKIT MINGW64 /d/newproject/GitApps (master)
$ git status
On branch master

No commits yet

Changes to be committed:
  (use "git rm --cached <file>..." to unstage)

        new file:   TestApp/abc.txt


ADMIN@KARTHIKIT MINGW64 /d/newproject/GitApps (master)
$ git commit -m "First Cut"
[master (root-commit) 19b623f] First Cut
 88 files changed, 2000 insertions(+)
 create mode 100644 JavaMailApp/.classpath

 create mode 100644 SpringSMSApp/InheritenceClass.class
 create mode 100644 SpringSMSApp/README.md
 create mode 100644 TestApp/.project
 create mode 100644 TestApp/README.md
 create mode 100644 TestApp/abc.txt

ADMIN@KARTHIKIT MINGW64 /d/newproject/GitApps (master)
$ git push -u origin master
Counting objects: 145, done.
Delta compression using up to 2 threads.
Compressing objects: 100% (111/111), done.
Writing objects: 100% (145/145), 38.94 KiB | 949.00 KiB/s, done.
Total 145 (delta 21), reused 0 (delta 0)
remote: Resolving deltas: 100% (21/21), done.
To https://github.com/kaushalkbca15/newProject.git
 * [new branch]      master -> master
Branch 'master' set up to track remote branch 'master' from 'origin'.

ADMIN@KARTHIKIT MINGW64 /d/newproject/GitApps (master)
$
