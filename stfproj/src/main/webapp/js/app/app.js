/*
 * JBoss, Home of Professional Open Source
 * Copyright 2013, Red Hat, Inc. and/or its affiliates, and individual
 * contributors by the @authors tag. See the copyright.txt in the
 * distribution for a full listing of individual contributors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * http://www.apache.org/licenses/LICENSE-2.0
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
// Define any routes for the app
// Note that this app is a single page app, and each partial is routed to using the URL fragment. For example, to select the 'home' route, the URL is http://localhost:8080/jboss-as-kitchensink-angularjs/#/home
var app = angular.module('stfproj', ['listaLivrosService']);

app.controller('LoginController',function($scope,$http){
	console.log('carrega Login Controller');
	$scope.username = "";
	$scope.password = "";
	$scope.isLogged = false;

	$http.get("/rest/isLogged").success(function(data){
		$scope.isLogged = data;
			console.log(data);
	}).error(function(data){
		console.log('error');
	});
	
	if($scope.isLogged){
		$http.get("/rest/getUserLogged").success(function(data){
			$scope.username = data;
				console.log(data);
		}).error(function(data){
			console.log('error');
		});
	}

	
	$scope.login = function(){
		console.log('chamou a funcao de login');
		$http.post("/login",{'username':this.username,'password':this.password}).sucess(function(data){
			console.log('sucesso');
		}).error(function(){
			console.log('erro!');
		});
	};
	
	$scope.getUsername = function(){
		console.log('getUsername')
		$http.get("/rest/getUserLogged").success(function(data){
			if(data == true){
				console.log('logado');
			}else{
				console.log('não logado')
			}
			
		}).error(function(data){
			console.log('error');
		})
	}	
});
app.config(
        [ '$routeProvider', function($routeProvider) {
            $routeProvider.
            // if URL fragment is /home, then load the home partial, with the
            // livrosController controller
            when('/listaLivros', {
                templateUrl : 'partials/listaLivros.html',
                controller : HomeControler
            }).when('/cadastrarLivro',{
            	templateUrl: 'partials/admin/cadastrarLivro.html',
            	controller : LivrosController
            // Add a default route
            }).otherwise({
                redirectTo : '/listaLivros'
            });
        } ]);


