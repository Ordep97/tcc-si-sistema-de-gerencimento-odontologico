help:
	@echo "---------------- HELP ---------------------"
	@fgrep -h "##" $(MAKEFILE_LIST) | fgrep -v fgrep | sed -e 's/\\$$//' | sed -e 's/\://'| sed -e 's/##//'


version=local
build: ##        - Build das imagens
	docker build --platform linux/amd64 -t api:${version} -f Dockerfile-back . & \
	docker build --platform linux/amd64 -t front:${version} -f Dockerfile-front .

run: ##          - Executa o projeto
	docker-compose up

publish: build ##- Push da imagem para o DockerHub
	docker push ${image}