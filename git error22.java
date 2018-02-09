
ADMIN@KARTHIKIT MINGW64 ~
$ cd e:

ADMIN@KARTHIKIT MINGW64 /e
$ cd G
giri/     Git-Prac/ gopinath/ gounit/   gud.c     gud.java

ADMIN@KARTHIKIT MINGW64 /e
$ cd Git-Prac/GitApps/

ADMIN@KARTHIKIT MINGW64 /e/Git-Prac/GitApps (master)
$ cd ..

ADMIN@KARTHIKIT MINGW64 /e/Git-Prac (master)
$ ls -al
total 136
drwxr-xr-x 1 ADMIN 197121 0 Feb  9 12:22 ./
drwxr-xr-x 1 ADMIN 197121 0 Feb  9 12:20 ../
drwxr-xr-x 1 ADMIN 197121 0 Feb  9 12:30 .git/
drwxr-xr-x 1 ADMIN 197121 0 Feb  9 12:20 GitApps/

ADMIN@KARTHIKIT MINGW64 /e/Git-Prac (master)
$ rm -rf .git

ADMIN@KARTHIKIT MINGW64 /e/Git-Prac
$ git status
fatal: Not a git repository (or any of the parent directories): .git

ADMIN@KARTHIKIT MINGW64 /e/Git-Prac
$ ll
total 4
drwxr-xr-x 1 ADMIN 197121 0 Feb  9 12:20 GitApps/

ADMIN@KARTHIKIT MINGW64 /e/Git-Prac
$ cd GitApps/

ADMIN@KARTHIKIT MINGW64 /e/Git-Prac/GitApps (master)
$ ls
ClientApp/    PaginationApps/  README.md      TestApp/
JavaMailApp/  Provider/        SpringSMSApp/

ADMIN@KARTHIKIT MINGW64 /e/Git-Prac/GitApps (master)
$ git init
Reinitialized existing Git repository in E:/Git-Prac/GitApps/.git/

ADMIN@KARTHIKIT MINGW64 /e/Git-Prac/GitApps (master)
$ git status
On branch master
Your branch is up to date with 'java/master'.

Changes not staged for commit:
  (use "git add <file>..." to update what will be committed)
  (use "git checkout -- <file>..." to discard changes in working directory)
  (commit or discard the untracked or modified content in submodules)

        modified:   PaginationApps (untracked content)
        modified:   TestApp (untracked content)

no changes added to commit (use "git add" and/or "git commit -a")

ADMIN@KARTHIKIT MINGW64 /e/Git-Prac/GitApps (master)
$ cd PaginationApps/

ADMIN@KARTHIKIT MINGW64 /e/Git-Prac/GitApps/PaginationApps (master)
$ ll
total 2
-rw-r--r-- 1 ADMIN 197121 1777 Feb  6 13:18 pom.xml
drwxr-xr-x 1 ADMIN 197121    0 Feb  9 12:20 src/
drwxr-xr-x 1 ADMIN 197121    0 Feb  9 12:20 target/

ADMIN@KARTHIKIT MINGW64 /e/Git-Prac/GitApps/PaginationApps (master)
$ git status
On branch master
Your branch and 'origin/master' have diverged,
and have 3 and 1 different commits each, respectively.
  (use "git pull" to merge the remote branch into yours)

Untracked files:
  (use "git add <file>..." to include in what will be committed)

        .gitignore

nothing added to commit but untracked files present (use "git add" to track)

ADMIN@KARTHIKIT MINGW64 /e/Git-Prac/GitApps/PaginationApps (master)
$ ls
pom.xml  src/  target/

ADMIN@KARTHIKIT MINGW64 /e/Git-Prac/GitApps/PaginationApps (master)
$ cd ..

ADMIN@KARTHIKIT MINGW64 /e/Git-Prac/GitApps (master)
$ git remote add java https://github.com/kaushalkbca15/javagit.git
fatal: remote java already exists.

ADMIN@KARTHIKIT MINGW64 /e/Git-Prac/GitApps (master)
$ git remote -v
java    https://github.com/kaushalkbca15/javagit.git (fetch)
java    https://github.com/kaushalkbca15/javagit.git (push)
origin  https://github.com/kaushalkbca15/JavaMail (fetch)
origin  https://github.com/kaushalkbca15/JavaMail (push)

ADMIN@KARTHIKIT MINGW64 /e/Git-Prac/GitApps (master)
$ git pull java master
From https://github.com/kaushalkbca15/javagit
 * branch            master     -> FETCH_HEAD
Already up to date.

ADMIN@KARTHIKIT MINGW64 /e/Git-Prac/GitApps (master)
$ git status
On branch master
Your branch is up to date with 'java/master'.

Changes not staged for commit:
  (use "git add <file>..." to update what will be committed)
  (use "git checkout -- <file>..." to discard changes in working directory)
  (commit or discard the untracked or modified content in submodules)

        modified:   PaginationApps (untracked content)
        modified:   TestApp (untracked content)

no changes added to commit (use "git add" and/or "git commit -a")

ADMIN@KARTHIKIT MINGW64 /e/Git-Prac/GitApps (master)
$ ls
ClientApp/  JavaMailApp/  PaginationApps/  Provider/  README.md  SpringSMSApp/  TestApp/

ADMIN@KARTHIKIT MINGW64 /e/Git-Prac/GitApps (master)
$ git add --all

ADMIN@KARTHIKIT MINGW64 /e/Git-Prac/GitApps (master)
$ git status
On branch master
Your branch is up to date with 'java/master'.

Changes not staged for commit:
  (use "git add <file>..." to update what will be committed)
  (use "git checkout -- <file>..." to discard changes in working directory)
  (commit or discard the untracked or modified content in submodules)

        modified:   PaginationApps (untracked content)
        modified:   TestApp (untracked content)

no changes added to commit (use "git add" and/or "git commit -a")

ADMIN@KARTHIKIT MINGW64 /e/Git-Prac/GitApps (master)
$ git chechout  PaginationApps
git: 'chechout' is not a git command. See 'git --help'.

The most similar command is
        checkout

ADMIN@KARTHIKIT MINGW64 /e/Git-Prac/GitApps (master)
$ git checkout  PaginationApps

ADMIN@KARTHIKIT MINGW64 /e/Git-Prac/GitApps (master)
$ git checkout  TestApp

ADMIN@KARTHIKIT MINGW64 /e/Git-Prac/GitApps (master)
$ git status
On branch master
Your branch is up to date with 'java/master'.

Changes not staged for commit:
  (use "git add <file>..." to update what will be committed)
  (use "git checkout -- <file>..." to discard changes in working directory)
  (commit or discard the untracked or modified content in submodules)

        modified:   PaginationApps (untracked content)
        modified:   TestApp (untracked content)

no changes added to commit (use "git add" and/or "git commit -a")

ADMIN@KARTHIKIT MINGW64 /e/Git-Prac/GitApps (master)
$ ls -al
total 21
drwxr-xr-x 1 ADMIN 197121  0 Feb  9 12:20 ./
drwxr-xr-x 1 ADMIN 197121  0 Feb  9 12:41 ../
drwxr-xr-x 1 ADMIN 197121  0 Feb  9 12:48 .git/
drwxr-xr-x 1 ADMIN 197121  0 Feb  9 12:20 .metadata/
drwxr-xr-x 1 ADMIN 197121  0 Feb  9 12:20 ClientApp/
drwxr-xr-x 1 ADMIN 197121  0 Feb  9 12:20 JavaMailApp/
drwxr-xr-x 1 ADMIN 197121  0 Feb  9 12:20 PaginationApps/
drwxr-xr-x 1 ADMIN 197121  0 Feb  9 12:20 Provider/
-rw-r--r-- 1 ADMIN 197121 37 Feb  2 19:40 README.md
drwxr-xr-x 1 ADMIN 197121  0 Feb  9 12:20 SpringSMSApp/
drwxr-xr-x 1 ADMIN 197121  0 Feb  9 12:20 TestApp/

ADMIN@KARTHIKIT MINGW64 /e/Git-Prac/GitApps (master)
$ git fetch java master
From https://github.com/kaushalkbca15/javagit
 * branch            master     -> FETCH_HEAD

ADMIN@KARTHIKIT MINGW64 /e/Git-Prac/GitApps (master)
$ git merge java master
merge: java - not something we can merge

ADMIN@KARTHIKIT MINGW64 /e/Git-Prac/GitApps (master)
$ git merge java master --force
error: unknown option `force'
usage: git merge [<options>] [<commit>...]
   or: git merge --abort
   or: git merge --continue

    -n                    do not show a diffstat at the end of the merge
    --stat                show a diffstat at the end of the merge
    --summary             (synonym to --stat)
    --log[=<n>]           add (at most <n>) entries from shortlog to merge commit message
    --squash              create a single commit instead of doing a merge
    --commit              perform a commit if the merge succeeds (default)
    -e, --edit            edit message before committing
    --ff                  allow fast-forward (default)
    --ff-only             abort if fast-forward is not possible
    --rerere-autoupdate   update the index with reused conflict resolution if possible
    --verify-signatures   verify that the named commit has a valid GPG signature
    -s, --strategy <strategy>
                          merge strategy to use
    -X, --strategy-option <option=value>
                          option for selected merge strategy
    -m, --message <message>
                          merge commit message (for a non-fast-forward merge)
    -v, --verbose         be more verbose
    -q, --quiet           be more quiet
    --abort               abort the current in-progress merge
    --continue            continue the current in-progress merge
    --allow-unrelated-histories
                          allow merging unrelated histories
    --progress            force progress reporting
    -S, --gpg-sign[=<key-id>]
                          GPG sign commit
    --overwrite-ignore    update ignored files (default)
    --signoff             add Signed-off-by:
    --verify              verify commit-msg hook


ADMIN@KARTHIKIT MINGW64 /e/Git-Prac/GitApps (master)
$ git merge --allow-unrelated-histories master
Already up to date.

ADMIN@KARTHIKIT MINGW64 /e/Git-Prac/GitApps (master)
$ git merge --allow-unrelated-histories master
Already up to date.

ADMIN@KARTHIKIT MINGW64 /e/Git-Prac/GitApps (master)
$ git status
On branch master
Your branch is up to date with 'java/master'.

Changes not staged for commit:
  (use "git add <file>..." to update what will be committed)
  (use "git checkout -- <file>..." to discard changes in working directory)
  (commit or discard the untracked or modified content in submodules)

        modified:   PaginationApps (untracked content)
        modified:   TestApp (untracked content)

no changes added to commit (use "git add" and/or "git commit -a")

ADMIN@KARTHIKIT MINGW64 /e/Git-Prac/GitApps (master)
$ git push -u java master
Everything up-to-date
Branch 'master' set up to track remote branch 'master' from 'java'.

ADMIN@KARTHIKIT MINGW64 /e/Git-Prac/GitApps (master)
$ cd ..

ADMIN@KARTHIKIT MINGW64 /e/Git-Prac
$ cd d:

ADMIN@KARTHIKIT MINGW64 /d
$ cd git/

ADMIN@KARTHIKIT MINGW64 /d/git
$ git status
fatal: Not a git repository (or any of the parent directories): .git

ADMIN@KARTHIKIT MINGW64 /d/git
$ git init
Initialized empty Git repository in D:/git/.git/

ADMIN@KARTHIKIT MINGW64 /d/git (master)
$ git status
On branch master

No commits yet

Untracked files:
  (use "git add <file>..." to include in what will be committed)

        JavaMailApp/
        PaginationApps/
        README.md
        SpringSMSApp/
        TestApp/

nothing added to commit but untracked files present (use "git add" to track)

ADMIN@KARTHIKIT MINGW64 /d/git (master)
$ git config --global user.name kaushal

ADMIN@KARTHIKIT MINGW64 /d/git (master)
$ git config --global user.email kaushal@gmail.com

ADMIN@KARTHIKIT MINGW64 /d/git (master)
$ git add --all
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

ADMIN@KARTHIKIT MINGW64 /d/git (master)
$ git submodule add PaginationApps
repo URL: 'PaginationApps' must be absolute or begin with ./|../

ADMIN@KARTHIKIT MINGW64 /d/git (master)
$ git submodule add https://github.com/kaushalkbca15/JavaMail.git PaginationApps
'PaginationApps' already exists in the index

ADMIN@KARTHIKIT MINGW64 /d/git (master)
$ git remote -v

ADMIN@KARTHIKIT MINGW64 /d/git (master)
$ git remote add java https://github.com/kaushalkbca15/JavaMail.git

ADMIN@KARTHIKIT MINGW64 /d/git (master)
$ git remote -v
java    https://github.com/kaushalkbca15/JavaMail.git (fetch)
java    https://github.com/kaushalkbca15/JavaMail.git (push)

ADMIN@KARTHIKIT MINGW64 /d/git (master)
$ git submodule add java  PaginationApps
repo URL: 'java' must be absolute or begin with ./|../

ADMIN@KARTHIKIT MINGW64 /d/git (master)
$ git add --all

ADMIN@KARTHIKIT MINGW64 /d/git (master)
$ git status
On branch master

No commits yet

Changes to be committed:
  (use "git rm --cached <file>..." to unstage)

        new file:   JavaMailApp/.classpath
        new file:   JavaMailApp/.project
        new file:   JavaMailApp/.settings/.jsdtscope
        new file:   JavaMailApp/.settings/org.eclipse.jdt.core.prefs
        new file:   JavaMailApp/.settings/org.eclipse.m2e.core.prefs
        new file:   JavaMailApp/.settings/org.eclipse.wst.common.component
        new file:   JavaMailApp/.settings/org.eclipse.wst.common.project.facet.core.xml
        new file:   JavaMailApp/.settings/org.eclipse.wst.jsdt.ui.superType.container
        new file:   JavaMailApp/.settings/org.eclipse.wst.jsdt.ui.superType.name
        new file:   JavaMailApp/.settings/org.eclipse.wst.validation.prefs
        new file:   JavaMailApp/pom.xml
        new file:   JavaMailApp/src/main/java/com/jms/config/JMSConfig.java
        new file:   JavaMailApp/src/main/java/com/jms/config/RootConfig.java
        new file:   JavaMailApp/src/main/java/com/jms/config/WebConfig.java
        new file:   JavaMailApp/src/main/java/com/jms/config/WebServletIntializer.java
        new file:   JavaMailApp/src/main/java/com/jms/controller/JMSController.java
        new file:   JavaMailApp/src/main/java/com/jms/service/JMSService.java
        new file:   JavaMailApp/src/main/java/com/jms/service/JMSServiceImpl.java
        new file:   JavaMailApp/src/main/webapp/WEB-INF/pages/home.jsp
        new file:   JavaMailApp/src/main/webapp/WEB-INF/web.xml
        new file:   JavaMailApp/src/main/webapp/index.jsp
        new file:   JavaMailApp/target/classes/com/jms/config/JMSConfig.class
        new file:   JavaMailApp/target/classes/com/jms/config/RootConfig.class
        new file:   JavaMailApp/target/classes/com/jms/config/WebConfig.class
        new file:   JavaMailApp/target/classes/com/jms/config/WebServletIntializer.class
        new file:   JavaMailApp/target/classes/com/jms/controller/JMSController.class
        new file:   JavaMailApp/target/classes/com/jms/service/JMSService.class
        new file:   JavaMailApp/target/classes/com/jms/service/JMSServiceImpl.class
        new file:   JavaMailApp/target/m2e-wtp/web-resources/META-INF/MANIFEST.MF
        new file:   JavaMailApp/target/m2e-wtp/web-resources/META-INF/maven/org.kk/JavaMailApp/pom.properties
        new file:   JavaMailApp/target/m2e-wtp/web-resources/META-INF/maven/org.kk/JavaMailApp/pom.xml
        new file:   README.md
        new file:   SpringSMSApp
        new file:   TestApp

Changes not staged for commit:
  (use "git add <file>..." to update what will be committed)
  (use "git checkout -- <file>..." to discard changes in working directory)
  (commit or discard the untracked or modified content in submodules)

        modified:   TestApp (untracked content)


ADMIN@KARTHIKIT MINGW64 /d/git (master)
$ git status
On branch master

No commits yet

Changes to be committed:
  (use "git rm --cached <file>..." to unstage)

        new file:   JavaMailApp/.classpath
        new file:   JavaMailApp/.project
        new file:   JavaMailApp/.settings/.jsdtscope
        new file:   JavaMailApp/.settings/org.eclipse.jdt.core.prefs
        new file:   JavaMailApp/.settings/org.eclipse.m2e.core.prefs
        new file:   JavaMailApp/.settings/org.eclipse.wst.common.component
        new file:   JavaMailApp/.settings/org.eclipse.wst.common.project.facet.core.xml
        new file:   JavaMailApp/.settings/org.eclipse.wst.jsdt.ui.superType.container
        new file:   JavaMailApp/.settings/org.eclipse.wst.jsdt.ui.superType.name
        new file:   JavaMailApp/.settings/org.eclipse.wst.validation.prefs
        new file:   JavaMailApp/pom.xml
        new file:   JavaMailApp/src/main/java/com/jms/config/JMSConfig.java
        new file:   JavaMailApp/src/main/java/com/jms/config/RootConfig.java
        new file:   JavaMailApp/src/main/java/com/jms/config/WebConfig.java
        new file:   JavaMailApp/src/main/java/com/jms/config/WebServletIntializer.java
        new file:   JavaMailApp/src/main/java/com/jms/controller/JMSController.java
        new file:   JavaMailApp/src/main/java/com/jms/service/JMSService.java
        new file:   JavaMailApp/src/main/java/com/jms/service/JMSServiceImpl.java
        new file:   JavaMailApp/src/main/webapp/WEB-INF/pages/home.jsp
        new file:   JavaMailApp/src/main/webapp/WEB-INF/web.xml
        new file:   JavaMailApp/src/main/webapp/index.jsp
        new file:   JavaMailApp/target/classes/com/jms/config/JMSConfig.class
        new file:   JavaMailApp/target/classes/com/jms/config/RootConfig.class
        new file:   JavaMailApp/target/classes/com/jms/config/WebConfig.class
        new file:   JavaMailApp/target/classes/com/jms/config/WebServletIntializer.class
        new file:   JavaMailApp/target/classes/com/jms/controller/JMSController.class
        new file:   JavaMailApp/target/classes/com/jms/service/JMSService.class
        new file:   JavaMailApp/target/classes/com/jms/service/JMSServiceImpl.class
        new file:   JavaMailApp/target/m2e-wtp/web-resources/META-INF/MANIFEST.MF
        new file:   JavaMailApp/target/m2e-wtp/web-resources/META-INF/maven/org.kk/JavaMailApp/pom.properties
        new file:   JavaMailApp/target/m2e-wtp/web-resources/META-INF/maven/org.kk/JavaMailApp/pom.xml
        new file:   README.md
        new file:   SpringSMSApp
        new file:   TestApp

Changes not staged for commit:
  (use "git add/rm <file>..." to update what will be committed)
  (use "git checkout -- <file>..." to discard changes in working directory)

        deleted:    TestApp


ADMIN@KARTHIKIT MINGW64 /d/git (master)
$ git rest TestApp
git: 'rest' is not a git command. See 'git --help'.

The most similar command is
        reset

ADMIN@KARTHIKIT MINGW64 /d/git (master)
$ git reset TestApp
fatal: ambiguous argument 'TestApp': unknown revision or path not in the working tree.
Use '--' to separate paths from revisions, like this:
'git <command> [<revision>...] -- [<file>...]'

ADMIN@KARTHIKIT MINGW64 /d/git (master)
$ git status
On branch master

No commits yet

Changes to be committed:
  (use "git rm --cached <file>..." to unstage)

        new file:   JavaMailApp/.classpath
        new file:   JavaMailApp/.project
        new file:   JavaMailApp/.settings/.jsdtscope
        new file:   JavaMailApp/.settings/org.eclipse.jdt.core.prefs
        new file:   JavaMailApp/.settings/org.eclipse.m2e.core.prefs
        new file:   JavaMailApp/.settings/org.eclipse.wst.common.component
        new file:   JavaMailApp/.settings/org.eclipse.wst.common.project.facet.core.xml
        new file:   JavaMailApp/.settings/org.eclipse.wst.jsdt.ui.superType.container
        new file:   JavaMailApp/.settings/org.eclipse.wst.jsdt.ui.superType.name
        new file:   JavaMailApp/.settings/org.eclipse.wst.validation.prefs
        new file:   JavaMailApp/pom.xml
        new file:   JavaMailApp/src/main/java/com/jms/config/JMSConfig.java
        new file:   JavaMailApp/src/main/java/com/jms/config/RootConfig.java
        new file:   JavaMailApp/src/main/java/com/jms/config/WebConfig.java
        new file:   JavaMailApp/src/main/java/com/jms/config/WebServletIntializer.java
        new file:   JavaMailApp/src/main/java/com/jms/controller/JMSController.java
        new file:   JavaMailApp/src/main/java/com/jms/service/JMSService.java
        new file:   JavaMailApp/src/main/java/com/jms/service/JMSServiceImpl.java
        new file:   JavaMailApp/src/main/webapp/WEB-INF/pages/home.jsp
        new file:   JavaMailApp/src/main/webapp/WEB-INF/web.xml
        new file:   JavaMailApp/src/main/webapp/index.jsp
        new file:   JavaMailApp/target/classes/com/jms/config/JMSConfig.class
        new file:   JavaMailApp/target/classes/com/jms/config/RootConfig.class
        new file:   JavaMailApp/target/classes/com/jms/config/WebConfig.class
        new file:   JavaMailApp/target/classes/com/jms/config/WebServletIntializer.class
        new file:   JavaMailApp/target/classes/com/jms/controller/JMSController.class
        new file:   JavaMailApp/target/classes/com/jms/service/JMSService.class
        new file:   JavaMailApp/target/classes/com/jms/service/JMSServiceImpl.class
        new file:   JavaMailApp/target/m2e-wtp/web-resources/META-INF/MANIFEST.MF
        new file:   JavaMailApp/target/m2e-wtp/web-resources/META-INF/maven/org.kk/JavaMailApp/pom.properties
        new file:   JavaMailApp/target/m2e-wtp/web-resources/META-INF/maven/org.kk/JavaMailApp/pom.xml
        new file:   README.md
        new file:   SpringSMSApp
        new file:   TestApp

Changes not staged for commit:
  (use "git add/rm <file>..." to update what will be committed)
  (use "git checkout -- <file>..." to discard changes in working directory)

        deleted:    TestApp


ADMIN@KARTHIKIT MINGW64 /d/git (master)
$ git rest --all
git: 'rest' is not a git command. See 'git --help'.

The most similar command is
        reset

ADMIN@KARTHIKIT MINGW64 /d/git (master)
$ git reset --all
error: unknown option `all'
usage: git reset [--mixed | --soft | --hard | --merge | --keep] [-q] [<commit>]
   or: git reset [-q] [<tree-ish>] [--] <paths>...
   or: EXPERIMENTAL: git reset [-q] [--stdin [-z]] [<tree-ish>]
   or: git reset --patch [<tree-ish>] [--] [<paths>...]

    -q, --quiet           be quiet, only report errors
    --mixed               reset HEAD and index
    --soft                reset only HEAD
    --hard                reset HEAD, index and working tree
    --merge               reset HEAD, index and working tree
    --keep                reset HEAD but keep local changes
    --recurse-submodules[=<reset>]
                          control recursive updating of submodules
    -p, --patch           select hunks interactively
    -N, --intent-to-add   record only the fact that removed paths will be added later
    -z                    EXPERIMENTAL: paths are separated with NUL character
    --stdin               EXPERIMENTAL: read paths from <stdin>


ADMIN@KARTHIKIT MINGW64 /d/git (master)
$ git rm --cache
usage: git rm [<options>] [--] <file>...

    -n, --dry-run         dry run
    -q, --quiet           do not list removed files
    --cached              only remove from the index
    -f, --force           override the up-to-date check
    -r                    allow recursive removal
    --ignore-unmatch      exit with a zero status even if nothing matched


ADMIN@KARTHIKIT MINGW64 /d/git (master)
$ git rm --cached
usage: git rm [<options>] [--] <file>...

    -n, --dry-run         dry run
    -q, --quiet           do not list removed files
    --cached              only remove from the index
    -f, --force           override the up-to-date check
    -r                    allow recursive removal
    --ignore-unmatch      exit with a zero status even if nothing matched


ADMIN@KARTHIKIT MINGW64 /d/git (master)
$ git rm -f --cached
usage: git rm [<options>] [--] <file>...

    -n, --dry-run         dry run
    -q, --quiet           do not list removed files
    --cached              only remove from the index
    -f, --force           override the up-to-date check
    -r                    allow recursive removal
    --ignore-unmatch      exit with a zero status even if nothing matched


ADMIN@KARTHIKIT MINGW64 /d/git (master)
$ git rm -f TestApp
rm 'TestApp'

ADMIN@KARTHIKIT MINGW64 /d/git (master)
$ git status
On branch master

No commits yet

Changes to be committed:
  (use "git rm --cached <file>..." to unstage)

        new file:   JavaMailApp/.classpath
        new file:   JavaMailApp/.project
        new file:   JavaMailApp/.settings/.jsdtscope
        new file:   JavaMailApp/.settings/org.eclipse.jdt.core.prefs
        new file:   JavaMailApp/.settings/org.eclipse.m2e.core.prefs
        new file:   JavaMailApp/.settings/org.eclipse.wst.common.component
        new file:   JavaMailApp/.settings/org.eclipse.wst.common.project.facet.core.xml
        new file:   JavaMailApp/.settings/org.eclipse.wst.jsdt.ui.superType.container
        new file:   JavaMailApp/.settings/org.eclipse.wst.jsdt.ui.superType.name
        new file:   JavaMailApp/.settings/org.eclipse.wst.validation.prefs
        new file:   JavaMailApp/pom.xml
        new file:   JavaMailApp/src/main/java/com/jms/config/JMSConfig.java
        new file:   JavaMailApp/src/main/java/com/jms/config/RootConfig.java
        new file:   JavaMailApp/src/main/java/com/jms/config/WebConfig.java
        new file:   JavaMailApp/src/main/java/com/jms/config/WebServletIntializer.java
        new file:   JavaMailApp/src/main/java/com/jms/controller/JMSController.java
        new file:   JavaMailApp/src/main/java/com/jms/service/JMSService.java
        new file:   JavaMailApp/src/main/java/com/jms/service/JMSServiceImpl.java
        new file:   JavaMailApp/src/main/webapp/WEB-INF/pages/home.jsp
        new file:   JavaMailApp/src/main/webapp/WEB-INF/web.xml
        new file:   JavaMailApp/src/main/webapp/index.jsp
        new file:   JavaMailApp/target/classes/com/jms/config/JMSConfig.class
        new file:   JavaMailApp/target/classes/com/jms/config/RootConfig.class
        new file:   JavaMailApp/target/classes/com/jms/config/WebConfig.class
        new file:   JavaMailApp/target/classes/com/jms/config/WebServletIntializer.class
        new file:   JavaMailApp/target/classes/com/jms/controller/JMSController.class
        new file:   JavaMailApp/target/classes/com/jms/service/JMSService.class
        new file:   JavaMailApp/target/classes/com/jms/service/JMSServiceImpl.class
        new file:   JavaMailApp/target/m2e-wtp/web-resources/META-INF/MANIFEST.MF
        new file:   JavaMailApp/target/m2e-wtp/web-resources/META-INF/maven/org.kk/JavaMailApp/pom.properties
        new file:   JavaMailApp/target/m2e-wtp/web-resources/META-INF/maven/org.kk/JavaMailApp/pom.xml
        new file:   README.md
        new file:   SpringSMSApp


ADMIN@KARTHIKIT MINGW64 /d/git (master)
$ git commit -m"this is java files"
[master (root-commit) 289e55a] this is java files
 33 files changed, 481 insertions(+)
 create mode 100644 JavaMailApp/.classpath
 create mode 100644 JavaMailApp/.project
 create mode 100644 JavaMailApp/.settings/.jsdtscope
 create mode 100644 JavaMailApp/.settings/org.eclipse.jdt.core.prefs
 create mode 100644 JavaMailApp/.settings/org.eclipse.m2e.core.prefs
 create mode 100644 JavaMailApp/.settings/org.eclipse.wst.common.component
 create mode 100644 JavaMailApp/.settings/org.eclipse.wst.common.project.facet.core.xml
 create mode 100644 JavaMailApp/.settings/org.eclipse.wst.jsdt.ui.superType.container
 create mode 100644 JavaMailApp/.settings/org.eclipse.wst.jsdt.ui.superType.name
 create mode 100644 JavaMailApp/.settings/org.eclipse.wst.validation.prefs
 create mode 100644 JavaMailApp/pom.xml
 create mode 100644 JavaMailApp/src/main/java/com/jms/config/JMSConfig.java
 create mode 100644 JavaMailApp/src/main/java/com/jms/config/RootConfig.java
 create mode 100644 JavaMailApp/src/main/java/com/jms/config/WebConfig.java
 create mode 100644 JavaMailApp/src/main/java/com/jms/config/WebServletIntializer.java
 create mode 100644 JavaMailApp/src/main/java/com/jms/controller/JMSController.java
 create mode 100644 JavaMailApp/src/main/java/com/jms/service/JMSService.java
 create mode 100644 JavaMailApp/src/main/java/com/jms/service/JMSServiceImpl.java
 create mode 100644 JavaMailApp/src/main/webapp/WEB-INF/pages/home.jsp
 create mode 100644 JavaMailApp/src/main/webapp/WEB-INF/web.xml
 create mode 100644 JavaMailApp/src/main/webapp/index.jsp
 create mode 100644 JavaMailApp/target/classes/com/jms/config/JMSConfig.class
 create mode 100644 JavaMailApp/target/classes/com/jms/config/RootConfig.class
 create mode 100644 JavaMailApp/target/classes/com/jms/config/WebConfig.class
 create mode 100644 JavaMailApp/target/classes/com/jms/config/WebServletIntializer.class
 create mode 100644 JavaMailApp/target/classes/com/jms/controller/JMSController.class
 create mode 100644 JavaMailApp/target/classes/com/jms/service/JMSService.class
 create mode 100644 JavaMailApp/target/classes/com/jms/service/JMSServiceImpl.class
 create mode 100644 JavaMailApp/target/m2e-wtp/web-resources/META-INF/MANIFEST.MF
 create mode 100644 JavaMailApp/target/m2e-wtp/web-resources/META-INF/maven/org.kk/JavaMailApp/pom.properties
 create mode 100644 JavaMailApp/target/m2e-wtp/web-resources/META-INF/maven/org.kk/JavaMailApp/pom.xml
 create mode 100644 README.md
 create mode 160000 SpringSMSApp

ADMIN@KARTHIKIT MINGW64 /d/git (master)
$ git remote -v
java    https://github.com/kaushalkbca15/JavaMail.git (fetch)
java    https://github.com/kaushalkbca15/JavaMail.git (push)

ADMIN@KARTHIKIT MINGW64 /d/git (master)
$ git status
On branch master
nothing to commit, working tree clean

ADMIN@KARTHIKIT MINGW64 /d/git (master)
$ git push -u java  master
To https://github.com/kaushalkbca15/JavaMail.git
 ! [rejected]        master -> master (fetch first)
error: failed to push some refs to 'https://github.com/kaushalkbca15/JavaMail.git'
hint: Updates were rejected because the remote contains work that you do
hint: not have locally. This is usually caused by another repository pushing
hint: to the same ref. You may want to first integrate the remote changes
hint: (e.g., 'git pull ...') before pushing again.
hint: See the 'Note about fast-forwards' in 'git push --help' for details.

ADMIN@KARTHIKIT MINGW64 /d/git (master)
$ git pull java  master
warning: no common commits
remote: Counting objects: 68, done.
remote: Compressing objects: 100% (46/46), done.
remote: Total 68 (delta 0), reused 62 (delta 0), pack-reused 0
Unpacking objects: 100% (68/68), done.
From https://github.com/kaushalkbca15/JavaMail
 * branch            master     -> FETCH_HEAD
 * [new branch]      master     -> java/master
fatal: refusing to merge unrelated histories

ADMIN@KARTHIKIT MINGW64 /d/git (master)
$ git push -u java  master
To https://github.com/kaushalkbca15/JavaMail.git
 ! [rejected]        master -> master (non-fast-forward)
error: failed to push some refs to 'https://github.com/kaushalkbca15/JavaMail.git'
hint: Updates were rejected because the tip of your current branch is behind
hint: its remote counterpart. Integrate the remote changes (e.g.
hint: 'git pull ...') before pushing again.
hint: See the 'Note about fast-forwards' in 'git push --help' for details.

ADMIN@KARTHIKIT MINGW64 /d/git (master)
$ git push  java  master
To https://github.com/kaushalkbca15/JavaMail.git
 ! [rejected]        master -> master (non-fast-forward)
error: failed to push some refs to 'https://github.com/kaushalkbca15/JavaMail.git'
hint: Updates were rejected because the tip of your current branch is behind
hint: its remote counterpart. Integrate the remote changes (e.g.
hint: 'git pull ...') before pushing again.
hint: See the 'Note about fast-forwards' in 'git push --help' for details.

ADMIN@KARTHIKIT MINGW64 /d/git (master)
$ git push --help

ADMIN@KARTHIKIT MINGW64 /d/git (master)
$ git push --help

ADMIN@KARTHIKIT MINGW64 /d/git (master)
$ git push  java  master
To https://github.com/kaushalkbca15/JavaMail.git
 ! [rejected]        master -> master (non-fast-forward)
error: failed to push some refs to 'https://github.com/kaushalkbca15/JavaMail.git'
hint: Updates were rejected because the tip of your current branch is behind
hint: its remote counterpart. Integrate the remote changes (e.g.
hint: 'git pull ...') before pushing again.
hint: See the 'Note about fast-forwards' in 'git push --help' for details.

ADMIN@KARTHIKIT MINGW64 /d/git (master)
$ git push --help

ADMIN@KARTHIKIT MINGW64 /d/git (master)
$ git push --force-with-lease=master:base master:master
error: cannot parse expected object name 'base'
usage: git push [<options>] [<repository> [<refspec>...]]

    -v, --verbose         be more verbose
    -q, --quiet           be more quiet
    --repo <repository>   repository
    --all                 push all refs
    --mirror              mirror all refs
    -d, --delete          delete refs
    --tags                push tags (can't be used with --all or --mirror)
    -n, --dry-run         dry run
    --porcelain           machine-readable output
    -f, --force           force updates
    --force-with-lease[=<refname>:<expect>]
                          require old value of ref to be at this value
    --recurse-submodules[=<check|on-demand|no>]
                          control recursive pushing of submodules
    --thin                use thin pack
    --receive-pack <receive-pack>
                          receive pack program
    --exec <receive-pack>
                          receive pack program
    -u, --set-upstream    set upstream for git pull/status
    --progress            force progress reporting
    --prune               prune locally removed refs
    --no-verify           bypass pre-push hook
    --follow-tags         push missing but relevant tags
    --signed[=<yes|no|if-asked>]
                          GPG sign the push
    --atomic              request atomic transaction on remote side
    -o, --push-option <server-specific>
                          option to transmit
    -4, --ipv4            use IPv4 addresses only
    -6, --ipv6            use IPv6 addresses only


ADMIN@KARTHIKIT MINGW64 /d/git (master)
$ git push --force-with-lease=master:java master:master
error: cannot parse expected object name 'java'
usage: git push [<options>] [<repository> [<refspec>...]]

    -v, --verbose         be more verbose
    -q, --quiet           be more quiet
    --repo <repository>   repository
    --all                 push all refs
    --mirror              mirror all refs
    -d, --delete          delete refs
    --tags                push tags (can't be used with --all or --mirror)
    -n, --dry-run         dry run
    --porcelain           machine-readable output
    -f, --force           force updates
    --force-with-lease[=<refname>:<expect>]
                          require old value of ref to be at this value
    --recurse-submodules[=<check|on-demand|no>]
                          control recursive pushing of submodules
    --thin                use thin pack
    --receive-pack <receive-pack>
                          receive pack program
    --exec <receive-pack>
                          receive pack program
    -u, --set-upstream    set upstream for git pull/status
    --progress            force progress reporting
    --prune               prune locally removed refs
    --no-verify           bypass pre-push hook
    --follow-tags         push missing but relevant tags
    --signed[=<yes|no|if-asked>]
                          GPG sign the push
    --atomic              request atomic transaction on remote side
    -o, --push-option <server-specific>
                          option to transmit
    -4, --ipv4            use IPv4 addresses only
    -6, --ipv6            use IPv6 addresses only


ADMIN@KARTHIKIT MINGW64 /d/git (master)
$ git push -f java master
Counting objects: 59, done.
Delta compression using up to 2 threads.
Compressing objects: 100% (42/42), done.
Writing objects: 100% (59/59), 11.50 KiB | 471.00 KiB/s, done.
Total 59 (delta 0), reused 0 (delta 0)
To https://github.com/kaushalkbca15/JavaMail.git
 + 3da1035...289e55a master -> master (forced update)

ADMIN@KARTHIKIT MINGW64 /d/git (master)
$ ll
total 1
drwxr-xr-x 1 ADMIN 197121  0 Feb  9 12:53 ClientApp/
drwxr-xr-x 1 ADMIN 197121  0 Feb  9 12:53 JavaMailApp/
drwxr-xr-x 1 ADMIN 197121  0 Feb  9 12:53 Provider/
-rw-r--r-- 1 ADMIN 197121 37 Feb  2 19:40 README.md
drwxr-xr-x 1 ADMIN 197121  0 Feb  9 13:24 RegistetionFormWithPhoto/
drwxr-xr-x 1 ADMIN 197121  0 Feb  9 12:53 SpringSMSApp/

ADMIN@KARTHIKIT MINGW64 /d/git (master)
$ git remote -v
java    https://github.com/kaushalkbca15/JavaMail.git (fetch)
java    https://github.com/kaushalkbca15/JavaMail.git (push)

ADMIN@KARTHIKIT MINGW64 /d/git (master)
$


ADMIN@KARTHIKIT MINGW64 /d/git (master)
$

ADMIN@KARTHIKIT MINGW64 /d/git (master)
$ git status
On branch master
Untracked files:
  (use "git add <file>..." to include in what will be committed)

        RegistetionFormWithPhoto/

nothing added to commit but untracked files present (use "git add" to track)

ADMIN@KARTHIKIT MINGW64 /d/git (master)
$ git add .

ADMIN@KARTHIKIT MINGW64 /d/git (master)
$ git status
On branch master
Changes to be committed:
  (use "git reset HEAD <file>..." to unstage)

        new file:   RegistetionFormWithPhoto/.classpath
        new file:   RegistetionFormWithPhoto/.project
        new file:   RegistetionFormWithPhoto/.settings/.jsdtscope
        new file:   RegistetionFormWithPhoto/.settings/org.eclipse.jdt.core.prefs
        new file:   RegistetionFormWithPhoto/.settings/org.eclipse.m2e.core.prefs
        new file:   RegistetionFormWithPhoto/.settings/org.eclipse.wst.common.component
        new file:   RegistetionFormWithPhoto/.settings/org.eclipse.wst.common.project.facet.core.xml
        new file:   RegistetionFormWithPhoto/.settings/org.eclipse.wst.jsdt.ui.superType.container
        new file:   RegistetionFormWithPhoto/.settings/org.eclipse.wst.jsdt.ui.superType.name
        new file:   RegistetionFormWithPhoto/.settings/org.eclipse.wst.validation.prefs
        new file:   RegistetionFormWithPhoto/pom.xml
        new file:   RegistetionFormWithPhoto/src/main/java/com/ks/config/RootConfig.java
        new file:   RegistetionFormWithPhoto/src/main/java/com/ks/config/ServletInitializer.java
        new file:   RegistetionFormWithPhoto/src/main/java/com/ks/config/WebConfig.java
        new file:   RegistetionFormWithPhoto/src/main/java/com/ks/controller/EmployeeController.java
        new file:   RegistetionFormWithPhoto/src/main/java/com/ks/dao/EmployeeDAO.java
        new file:   RegistetionFormWithPhoto/src/main/java/com/ks/dao/EmployeeDAOImpl.java
        new file:   RegistetionFormWithPhoto/src/main/java/com/ks/dto/EmployeeDTOPhoto.java
        new file:   RegistetionFormWithPhoto/src/main/java/com/ks/entity/EmployeeEntityPhoto.java
        new file:   RegistetionFormWithPhoto/src/main/java/com/ks/intercepter/DoublePossting.java
        new file:   RegistetionFormWithPhoto/src/main/java/com/ks/service/EmployeeService.java
        new file:   RegistetionFormWithPhoto/src/main/java/com/ks/service/EmployeeServiceImpl.java
        new file:   RegistetionFormWithPhoto/src/main/webapp/WEB-INF/pages/home.jsp
        new file:   RegistetionFormWithPhoto/src/main/webapp/WEB-INF/pages/photoUpload.jsp
        new file:   RegistetionFormWithPhoto/src/main/webapp/WEB-INF/pages/viewAll.jsp
        new file:   RegistetionFormWithPhoto/src/main/webapp/WEB-INF/web.xml
        new file:   RegistetionFormWithPhoto/src/main/webapp/index.jsp
        new file:   RegistetionFormWithPhoto/target/classes/com/ks/config/RootConfig.class
        new file:   RegistetionFormWithPhoto/target/classes/com/ks/config/ServletInitializer.class
        new file:   RegistetionFormWithPhoto/target/classes/com/ks/config/WebConfig.class
        new file:   RegistetionFormWithPhoto/target/classes/com/ks/controller/EmployeeController.class
        new file:   RegistetionFormWithPhoto/target/classes/com/ks/dao/EmployeeDAO.class
        new file:   RegistetionFormWithPhoto/target/classes/com/ks/dao/EmployeeDAOImpl.class
        new file:   RegistetionFormWithPhoto/target/classes/com/ks/dto/EmployeeDTOPhoto.class
        new file:   RegistetionFormWithPhoto/target/classes/com/ks/entity/EmployeeEntityPhoto.class
        new file:   RegistetionFormWithPhoto/target/classes/com/ks/intercepter/DoublePossting.class
        new file:   RegistetionFormWithPhoto/target/classes/com/ks/service/EmployeeService.class
        new file:   RegistetionFormWithPhoto/target/classes/com/ks/service/EmployeeServiceImpl.class
        new file:   RegistetionFormWithPhoto/target/m2e-wtp/web-resources/META-INF/MANIFEST.MF
        new file:   RegistetionFormWithPhoto/target/m2e-wtp/web-resources/META-INF/maven/org.kk/RegistetionFormWithPhoto/pom.properties
        new file:   RegistetionFormWithPhoto/target/m2e-wtp/web-resources/META-INF/maven/org.kk/RegistetionFormWithPhoto/pom.xml


ADMIN@KARTHIKIT MINGW64 /d/git (master)
$ git commit -m "Form with photos"
[master eb232ff] Form with photos
 41 files changed, 919 insertions(+)
 create mode 100644 RegistetionFormWithPhoto/.classpath
 create mode 100644 RegistetionFormWithPhoto/.project
 create mode 100644 RegistetionFormWithPhoto/.settings/.jsdtscope
 create mode 100644 RegistetionFormWithPhoto/.settings/org.eclipse.jdt.core.prefs
 create mode 100644 RegistetionFormWithPhoto/.settings/org.eclipse.m2e.core.prefs
 create mode 100644 RegistetionFormWithPhoto/.settings/org.eclipse.wst.common.component
 create mode 100644 RegistetionFormWithPhoto/.settings/org.eclipse.wst.common.project.facet.core.xml
 create mode 100644 RegistetionFormWithPhoto/.settings/org.eclipse.wst.jsdt.ui.superType.container
 create mode 100644 RegistetionFormWithPhoto/.settings/org.eclipse.wst.jsdt.ui.superType.name
 create mode 100644 RegistetionFormWithPhoto/.settings/org.eclipse.wst.validation.prefs
 create mode 100644 RegistetionFormWithPhoto/pom.xml
 create mode 100644 RegistetionFormWithPhoto/src/main/java/com/ks/config/RootConfig.java
 create mode 100644 RegistetionFormWithPhoto/src/main/java/com/ks/config/ServletInitializer.java
 create mode 100644 RegistetionFormWithPhoto/src/main/java/com/ks/config/WebConfig.java
 create mode 100644 RegistetionFormWithPhoto/src/main/java/com/ks/controller/EmployeeController.java
 create mode 100644 RegistetionFormWithPhoto/src/main/java/com/ks/dao/EmployeeDAO.java
 create mode 100644 RegistetionFormWithPhoto/src/main/java/com/ks/dao/EmployeeDAOImpl.java
 create mode 100644 RegistetionFormWithPhoto/src/main/java/com/ks/dto/EmployeeDTOPhoto.java
 create mode 100644 RegistetionFormWithPhoto/src/main/java/com/ks/entity/EmployeeEntityPhoto.java
 create mode 100644 RegistetionFormWithPhoto/src/main/java/com/ks/intercepter/DoublePossting.java
 create mode 100644 RegistetionFormWithPhoto/src/main/java/com/ks/service/EmployeeService.java
 create mode 100644 RegistetionFormWithPhoto/src/main/java/com/ks/service/EmployeeServiceImpl.java
 create mode 100644 RegistetionFormWithPhoto/src/main/webapp/WEB-INF/pages/home.jsp
 create mode 100644 RegistetionFormWithPhoto/src/main/webapp/WEB-INF/pages/photoUpload.jsp
 create mode 100644 RegistetionFormWithPhoto/src/main/webapp/WEB-INF/pages/viewAll.jsp
 create mode 100644 RegistetionFormWithPhoto/src/main/webapp/WEB-INF/web.xml
 create mode 100644 RegistetionFormWithPhoto/src/main/webapp/index.jsp
 create mode 100644 RegistetionFormWithPhoto/target/classes/com/ks/config/RootConfig.class
 create mode 100644 RegistetionFormWithPhoto/target/classes/com/ks/config/ServletInitializer.class
 create mode 100644 RegistetionFormWithPhoto/target/classes/com/ks/config/WebConfig.class
 create mode 100644 RegistetionFormWithPhoto/target/classes/com/ks/controller/EmployeeController.class
 create mode 100644 RegistetionFormWithPhoto/target/classes/com/ks/dao/EmployeeDAO.class
 create mode 100644 RegistetionFormWithPhoto/target/classes/com/ks/dao/EmployeeDAOImpl.class
 create mode 100644 RegistetionFormWithPhoto/target/classes/com/ks/dto/EmployeeDTOPhoto.class
 create mode 100644 RegistetionFormWithPhoto/target/classes/com/ks/entity/EmployeeEntityPhoto.class
 create mode 100644 RegistetionFormWithPhoto/target/classes/com/ks/intercepter/DoublePossting.class
 create mode 100644 RegistetionFormWithPhoto/target/classes/com/ks/service/EmployeeService.class
 create mode 100644 RegistetionFormWithPhoto/target/classes/com/ks/service/EmployeeServiceImpl.class
 create mode 100644 RegistetionFormWithPhoto/target/m2e-wtp/web-resources/META-INF/MANIFEST.MF
 create mode 100644 RegistetionFormWithPhoto/target/m2e-wtp/web-resources/META-INF/maven/org.kk/RegistetionFormWithPhoto/pom.properties
 create mode 100644 RegistetionFormWithPhoto/target/m2e-wtp/web-resources/META-INF/maven/org.kk/RegistetionFormWithPhoto/pom.xml

ADMIN@KARTHIKIT MINGW64 /d/git (master)
$

ADMIN@KARTHIKIT MINGW64 /d/git (master)
$ git status
On branch master
nothing to commit, working tree clean

ADMIN@KARTHIKIT MINGW64 /d/git (master)
$ git remove -v
git: 'remove' is not a git command. See 'git --help'.

The most similar command is
        remote

ADMIN@KARTHIKIT MINGW64 /d/git (master)
$ git remote -v
java    https://github.com/kaushalkbca15/JavaMail.git (fetch)
java    https://github.com/kaushalkbca15/JavaMail.git (push)

ADMIN@KARTHIKIT MINGW64 /d/git (master)
$ git branch
* master

ADMIN@KARTHIKIT MINGW64 /d/git (master)
$ git push -u java master
Counting objects: 68, done.
Delta compression using up to 2 threads.
Compressing objects: 100% (56/56), done.
Writing objects: 100% (68/68), 20.11 KiB | 735.00 KiB/s, done.
Total 68 (delta 2), reused 0 (delta 0)
remote: Resolving deltas: 100% (2/2), done.
To https://github.com/kaushalkbca15/JavaMail.git
   289e55a..eb232ff  master -> master
Branch 'master' set up to track remote branch 'master' from 'java'.

ADMIN@KARTHIKIT MINGW64 /d/git (master)
$ history
    1  $Git
    2  clear
    3  git remote add origin "https://github.com/kaushalkbca15/JavaMail.git"
    4  git remote add origin https://github.com/kaushalkbca15/JavaMail.git
    5  git remote add JavaMail "https://github.com/kaushalkbca15/JavaMail.git"
    6  $git
    7  git
    8  clear
    9  git remote add origin "https://github.com/kaushalkbca15/JavaMail.git"
   10  git remote add origin "https://github.com/kaushalkbca15/JavaMail.git"
   11  git pul origim master
   12  git pull origin master
   13   git status
   14  clean
   15  clean
   16  git add abc.txt
   17  git add abc.txt
   18  git status
   19  git commit -m "added one text file"
   20  git add -A
   21   git commit -a -m "test app"
   22  git config --list --global | grep user
   23  user.name=kaushal kumar
   24  user.name=kaushal
   25  git config --list --global | kaushal user
   26  git config --list --global | grep user
   27  user.name=
   28  user.name=kk
   29  user.name=kaushalbca15@gmail.com
   30  user.name=kaushalkbca15
   31  git config --global user.email "kaushalbca15@gmail.com"
   32  user.name=kaushalkbca15
   33  git config --global user.email "kaushalbca15@gmail.com"
   34   git commit -a -m "test app"
   35  git config --unset --local user.name
   36   git commit -a -m "test app"
   37  git status
   38  clean
   39  git add -A
   40   git status
   41  git commit -m "aaa"
   42  git log
   43  git checkout master
   44  ls
   45  git branch TL
   46  git checkout TL
   47  ls
   48  git add -A
   49  git add -A
   50  git status
   51  git checkout master
   52  clear
   53  git status
   54  ls
   55  git checkout TL
   56  git commit -m "I added Two apps "
   57  git checkout master
   58  git checkout master
   59  ls
   60  git commit -m "a"
   61  git checkout master
   62  git status
   63  git log
   64  git checkout master
   65  git status
   66  git remote add origin "https://github.com/kaushalkbca15/JavaMail.git"
   67  git status
   68  git pul master
   69  git pul origin master
   70  git checkout master
   71  git
   72  -help
   73  git checkout master
   74  get status
   75  ls
   76  git add -A
   77  checkout master
   78  git checkout master
   79  ls
   80  git checkout master
   81  git status
   82  git commit
   83  git config --global user.name "Sam Smith"
   84  git config --global user.name "kaushal"
   85  git config --global user.email kaushalbca15@gmail.com
   86  git init
   87  git clone /path/to/repository
   88  git config --global user.name "kaushal"
   89  git config -- global user.email kaushalbca15@gmail.com
   90  git config --global user.email kaushalbca15@gmail.com
   91  git init
   92  git clone /path/to/repository
   93  clean
   94  cleane
   95  cleane
   96  git clone username@host:/path/to/repository
   97  git clone https://github.com/kaushalkbca15/SpringSMSApp.git:/path/to/repository
   98  git clone kaushalkbca15@host:/path/to/repository
   99  git clone https://github.com/kaushalkbca15/SpringSMSApp.git
  100  git add -A
  101  git add *
  102  git commit -m "added new file"
  103  git commit -a
  104  gti push origin master
  105  git push origin master
  106  git status
  107  git add -A
  108  ls
  109  git remote -v
  110  git branch
  111  git branch -d<TL>
  112  git branch -d <TL>
  113  git branch -d TL
  114  git chechout master
  115  git checkout master
  116  git branch
  117  git branch -d TL
  118  git branch -d <TL>
  119  git push --al origin
  120  sf
  121  sa
  122  git pull
  123  ls -al
  124  git log
  125  clear
  126  git remote -v
  127  git remote add java https://github.com/kaushalkbca15/javagit.git
  128  git remote -v
  129  git status
  130  git add .
  131  git add --all
  132  git status
  133  git commit -m"this  is java"
  134  git status
  135  ls
  136  git branch
  137  git push -u java master
  138  cd
  139  mkdir abcd
  140  cd abcd
  141  git clone https://github.com/kaushalkbca15/javagit.git
  142  ls
  143  cd javagit/
  144  ll
  145  git marge master
  146  ls
  147  cat JavaMailApp
  148  ls
  149  git log
  150  ll
  151  cd PaginationApps/
  152  ll
  153  pwd
  154  cd E:
  155  ls
  156  cd  Git-Prac
  157  ls
  158  git init
  159  git add .
  160  git add --all
  161  git status
  162  git commit -m"hjhjkhj"
  163  git status
  164  cd GitApps/
  165  ll
  166  cd ..
  167  git remote -v
  168  git remote add origin https://github.com/kaushalkbca15/git-prac.git
  169  git push -u origin master
  170  git status
  171  git add --help
  172  ls
  173  ls -al
  174  cd GitApps/
  175  ll
  176  cd ClientApp/
  177  ll
  178  cd src/
  179  ll
  180  tree main/
  181  yum -y install tree
  182  cd ..
  183  cd ..
  184  ls
  185  git status
  186  cd ..
  187  git add GitApps
  188  git status
  189  gis status
  190  git remot -v
  191  git remote -v
  192  git remote -v
  193  git add MYBANKPROJ
  194  git remote add bank https://github.com/kaushalkbca15/BankRepo.git
  195  git remote add MYBANKPROJ https://github.com/kaushalkbca15/BankRepo.git
  196  git add MYBANKPROJ
  197  git add bankrepo
  198   git remote -v
  199  git add bank
  200  git add kaushal
  201  clean
  202  ll
  203  git status
  204  git init
  205  git status
  206  ld -ak
  207  ld -al
  208  ls -al
  209  git lolg
  210  git log
  211  clear
  212  git remote -v
  213  git remote add bank https://github.com/kaushalkbca15/BankRepo.git
  214  git remote -v
  215  git status
  216  git add --all
  217  git status
  218  git status
  219  git status
  220  git commit -s "this is my bank project"
  221  git commit -m "this is my bank project"
  222  git status
  223  ls
  224  git branch
  225  git branch
  226  ls
  227  git branch
  228  git push -u bank master
  229  git push -u bank master
  230  git remote add bank https://github.com/kaushalkbca15/BankRepo.git
  231  git push -u bank master
  232  gir add --all :/
  233  gir add --all
  234  git add --all :/
  235  git commit -am "this is bank project"
  236  git push -u bank master
  237  git add -all
  238  git add --all
  239  git status
  240  git commit -m "this is bank project"
  241  git staus
  242  git status
  243  ls
  244  git branch
  245  git push -u bank master
  246  ~~~~~~cd
  247  cd
  248  mkdir abcd
  249  mkdir abc
  250  ll
  251  git remote clone origin https://github.com/kaushalkbca15/BankRepo.git
  252  git remote clone bank https://github.com/kaushalkbca15/BankRepo.git
  253  git clone bank https://github.com/kaushalkbca15/BankRepo.git
  254  git clone bankgit https://github.com/kaushalkbca15/BankRepo.git
  255  git clone https://github.com/kaushalkbca15/javagit.git
  256  ls
  257  cd javagit
  258  ls
  259  cd e:
  260  cd Git-Prac/GitApps/
  261  cd ..
  262  ls -al
  263  rm -rf .git
  264  git status
  265  ll
  266  cd GitApps/
  267  ls
  268  git init
  269  git status
  270  cd PaginationApps/
  271  ll
  272  git status
  273  ls
  274  cd ..
  275  git remote add java https://github.com/kaushalkbca15/javagit.git
  276  git remote -v
  277  git pull java master
  278  git status
  279  ls
  280  git add --all
  281  git status
  282  git chechout  PaginationApps
  283  git checkout  PaginationApps
  284  git checkout  TestApp
  285  git status
  286  ls -al
  287  git fetch java master
  288  git merge java master
  289  git merge java master --force
  290  git merge --allow-unrelated-histories master
  291  git merge --allow-unrelated-histories master
  292  git status
  293  git push -u java master
  294  cd ..
  295  cd d:
  296  cd git/
  297  git status
  298  git init
  299  git status
  300  git config --global user.name kaushal
  301  git config --global user.email kaushal@gmail.com
  302  git add --all
  303  git submodule add PaginationApps
  304  git submodule add https://github.com/kaushalkbca15/JavaMail.git PaginationApps
  305  git remote -v
  306  git remote add java https://github.com/kaushalkbca15/JavaMail.git
  307  git remote -v
  308  git submodule add java  PaginationApps
  309  git add --all
  310  git status
  311  git status
  312  git rest TestApp
  313  git reset TestApp
  314  git status
  315  git rest --all
  316  git reset --all
  317  git rm --cache
  318  git rm --cached
  319  git rm -f --cached
  320  git rm -f TestApp
  321  git status
  322  git commit -m"this is java files"
  323  git remote -v
  324  git status
  325  git push -u java  master
  326  git pull java  master
  327  git push -u java  master
  328  git push  java  master
  329  git push --help
  330  git push --help
  331  git push  java  master
  332  git push --help
  333  git push --force-with-lease=master:base master:master
  334  git push --force-with-lease=master:java master:master
  335  git push -f java master
  336  ll
  337  git remote -v
  338  git status
  339  git add .
  340  git status
  341  git commit -m "Form with photos"
  342  git status
  343  git remove -v
  344  git remote -v
  345  git branch
  346  git push -u java master
  347  history

ADMIN@KARTHIKIT MINGW64 /d/git (master)
$ git remote
java

ADMIN@KARTHIKIT MINGW64 /d/git (master)
$ git remote -v
java    https://github.com/kaushalkbca15/JavaMail.git (fetch)
java    https://github.com/kaushalkbca15/JavaMail.git (push)

ADMIN@KARTHIKIT MINGW64 /d/git (master)
$
