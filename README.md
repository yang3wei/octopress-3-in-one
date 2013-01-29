Description:
============
It's a 3-in-1 plugin to add tag-cloud and category features for octopress!!

Why did i create this repo?
===========================
I really feel boring to find the right position to place the neccesary files!  
Also I feel boring to pick the useful files out of the 'test-case' files!!  
To be honest, it's not an interesting thing at all!  
It's not a pleasnt experience to do this, so I gathered the 'must-have' files all!

What you need to do?
====================
1.Place all existing file except 'README.md' into ocotpress's home dir as the structure I organized! 

2.Open the \_config.yml file, append the items listed below to 'default_asides':
<pre><code>custom/asides/tags.html
custom/asides/category_list.html
</code></pre>
For example, if 'default_asides' old value is:  
<code>[asides/recent_posts.html]</code>  
After the append operation, it should be like this:  
<code>[asides/recent_posts.html, custom/asides/tags.html, custom/asides/category_list.html]</code>

3.The last and most important thing:  
Check whether <code>tag_dir: tags</code> exists in \_config.yml file!!  
If not, you should add it next-line under <code>category\_dir: blog/categories</code>.  
It's a really annoying thing confused me for several hours!!  
It didn't redirect to the right address after I clicked a link in the tag-cloud!  
For example, it went forward directly to the tag word!!  
You could imagine how it would be a result, it's not a host or ip address at all!  

Need some help?(Language: Chinese)
==================================
Below is a really useful link which may be bring you some good luck!  
[http://codemacro.com/2012/07/18/add-tag-to-octopress/](http://codemacro.com/2012/07/18/add-tag-to-octopress/ "luck")

Related plugin's root repo:
===========================
[https://github.com/robbyedwards/octopress-tag-pages](https://github.com/robbyedwards/octopress-tag-pages)  
[https://github.com/robbyedwards/octopress-tag-pages](https://github.com/robbyedwards/octopress-tag-pages)  
[https://github.com/alswl/octopress-category-list](https://github.com/alswl/octopress-category-list)  



