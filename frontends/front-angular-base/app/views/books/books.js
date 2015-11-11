'use strict'
/**
* Controlador para 'Book', se define Route + Controller
*/
angular.module('myApp.books', ['servicesModule'])
	.config(['$routeProvider', function($routeProvider) {
	  $routeProvider.when('/books', {
	    templateUrl: 'views/books/books.html',
	    controller: 'BookController',
			resolve: {
				loadedBooks: function(bookService) {
					return bookService.getBooks();
				}
			}
	  });
	}]).controller('BookController', function($scope, loadedBooks) {
		$scope.books = loadedBooks;
	});
