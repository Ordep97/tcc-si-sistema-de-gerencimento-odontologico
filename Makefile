help:
	@echo "---------------- HELP ---------------------"
	@fgrep -h "##" $(MAKEFILE_LIST) | fgrep -v fgrep | sed -e 's/\\$$//' | sed -e 's/\://'| sed -e 's/##//'


VERSION=1.0
PROJECT_ID=tcc-sgco
build-front-local: ##        - Build Frontend Local
	docker build --platform linux/amd64 -t front-sgco:${VERSION} -f Dockerfile-front .

build-front-gcp: ##        - Build Frontend GCP
	docker build -t gcr.io/${PROJECT_ID}/sgco/front-sgco:${VERSION} -f Dockerfile-front .

build-back-local: ##        - Build Backend local
	docker build --platform linux/amd64 -t api-sgco:${VERSION} -f Dockerfile-back .

build-back-gcp: ##        - Build Backend GCP
	docker build --no-cache -t gcr.io/${PROJECT_ID}/sgco/back-sgco:${VERSION} -f Dockerfile-back .

build: build-front-local build-back-local

run: ##          - Executa o projeto
	docker-compose up

publish-front: ##- Push Frontend Docker Image
	docker push gcr.io/${PROJECT_ID}/sgco/front-sgco:${VERSION}

publish-back: ##- Push Backend Docker Image
	docker push gcr.io/${PROJECT_ID}/sgco/back-sgco:${VERSION}