

angular.module('servicesModule', ['ng'])
	.factory('bookService', function($http, $q) {
			return {
				getBooks : function() {
					var defered = $q.defer();
					var promise = defered.promise;
        	$http({
            url: 'http://localhost:5555/backend-rest/api/1.0/books',
            method: "GET",
            params: {
            }
          }).success(function (data) {
            defered.resolve(data);
          }).error(function (error) {
						defered.reject(error);
					});
					return promise;
        },
				getBookById : function() {
					return 'hola';
				},
				saveBook : function(params) {
					console.log('Saving Book: '+ params);
				}
			}
		});
