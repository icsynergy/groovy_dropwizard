# Gradle built Groovy / Dropwizard deployed to Heroku Example #


## Steps ##

### Git ###

	$ git init
	$ git add .
	$ git commit -m "init"

** TODO - ADD STEPS FOR A REPO CLONED FROM GITHUB **

### Heroku ###

** NOTE these instructions assume you've installed the heruko toolbelt **

Login to heroku
	$ heroku login
	Enter your Heroku credentials.
	Email: ***@***.***
	Password (typing will be hidden): 
	Authentication successful.

Create a heroku app and setup your local app to remote to heroku
	$ heroku create
	Creating nameless-****-****... done, stack is cedar
	http://nameless-****-****.herokuapp.com/ | git@heroku.com:nameless-****-****.git
	Git remote heroku added

Validates your remote
	$ git remote -v
	heroku	git@heroku.com:nameless-****-****.git (fetch)
	heroku	git@heroku.com:nameless-****-****.git (push)

Rename the heroku instance. This will change your git remote as well.
	$ heroku apps:rename **** --app nameless-****-****
	Renaming nameless-****-**** to ****... done
	http://****.herokuapp.com/ | git@heroku.com:****.git
	Git remote heroku updated

Push your code to the heroku. You'll need to push any changes. This will force a clean / build of your app. 
	$ git push heroku master

Watch the logs for your app
	$ heroku logs --tail

