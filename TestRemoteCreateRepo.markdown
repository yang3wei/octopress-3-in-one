---
layout: post
title: "Octopress 新增博文时要注意的地方"
date: 2013-01-28 22:11
comments: true
categories: octopress相关
tags: octopress
---
尝试在从本地在github上面创建一个仓库

#Origin links
[Error when “git push” to github](http://stackoverflow.com/questions/959477/error-when-git-push-to-github)  
#I have a public repository at github.com with 2 branches : master and test.

I created a new directory locally and did:

[ ] git clone git@github.com:{username}/{projectname}.git
Then I created a new branch named my_test with

[ ] git branch my_test
and switched to it.

[ ] git checkout my_test
Then I merged it from my test branch of my public repository with

[ ] git merge origin/test
and it resulted in a fast forward.

I made some changes and committed them. Then I tried to push the local my_test branch to the public test branch at github with

[ ] git push git@github.com:{username}/{projectname}.git test 
but I got this error:

error: src refspec test does not match any.
fatal: The remote end hung up unexpectedly
error: failed to push some refs to 'git@github.com:{username}/{projectname}.git
What am I doing wrong ?

#Answer0(vote:19)
Perhaps try:

<pre><code>git push git@github.com:{username}/{projectname}.git HEAD:test</code></pre>
The format of the last parameter on that command line is a refspec which is a source ref followed by a colon and then the destination ref. You can also use your local branch name (my_test) instead of HEAD to be certain you're pushing the correct branch.

The documentation for git push has more detail on this parameter.

share|improve this answer
answered Jun 6 '09 at 11:14

Greg Hewgill
258k49491704
Thats worked. Thank you. – ebsbk Jun 6 '09 at 11:37
It worked like a charm :) – Alfredo Di Napoli Nov 9 '11 at 13:59

#Answer(vote:10)
Also, you don't need to type out the whole url each time you want to push. When you ran the clone, git saved that URL as 'origin', that's why you can run something like 'merge origin/test' - it means the 'test' branch on your 'origin' server. So, the simplest way to push to your server in that case would be:

<pre><code>git push origin my_test:test</code></pre>
That will push your local 'my_test' branch to the 'test' branch on your 'origin' server. If you had named your local branch the same as the branch on the server, then the colon is not neccesary, you can simply do:

<pre><code>git push origin test</code></pre>

share|improve this answer
answered Jun 8 '09 at 16:16

Scott Chacon
1,542510
