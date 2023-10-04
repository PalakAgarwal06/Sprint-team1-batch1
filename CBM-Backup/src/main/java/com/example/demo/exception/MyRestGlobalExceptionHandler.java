package com.example.demo.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.example.demo.dto.ApiResponse;
import com.example.demo.dto.ErrorInfo;

import java.time.LocalDateTime;
import java.util.stream.Collectors;

@RestControllerAdvice
public class MyRestGlobalExceptionHandler {
	
	//for CustomerNotFoundException
	@ExceptionHandler(CustomerNotFoundException.class)
	public ResponseEntity<ApiResponse> handleCustomerNotFoundException(CustomerNotFoundException ex){
		return new ResponseEntity<ApiResponse>(new ApiResponse(ex.getMessage(),ex.getMessage()), HttpStatus.NOT_FOUND);
	}
	
	@ExceptionHandler(MethodArgumentNotValidException.class)
	public ResponseEntity<ErrorInfo> exceptionHandlerCustomer(MethodArgumentNotValidException exception){
		ErrorInfo errorInfo = new ErrorInfo();
		errorInfo.setErrorCode(HttpStatus.BAD_REQUEST.value());
		
		String errorMsg = exception.getBindingResult().getAllErrors().stream().map(x -> x.getDefaultMessage()).collect(Collectors.joining(","));
		errorInfo.setErrorMessage(errorMsg);
		errorInfo.setTimestamp(LocalDateTime.now());
		return new ResponseEntity<>(errorInfo, HttpStatus.BAD_REQUEST);
		}
	

	
	//for EmployeeNotFoundException
	@ExceptionHandler(EmployeeNotFoundException.class)
	public ResponseEntity<ApiResponse> handleemployeeNotFoundException(EmployeeNotFoundException ex){
		return new ResponseEntity<ApiResponse>(new ApiResponse(ex.getMessage(),ex.getMessage()), HttpStatus.NOT_FOUND);
	}
	
	@ExceptionHandler(MethodArgumentNotValidException.class)
	public ResponseEntity<ErrorInfo> exceptionHandlerEmployee(MethodArgumentNotValidException exception){
		ErrorInfo errorInfo = new ErrorInfo();
		errorInfo.setErrorCode(HttpStatus.BAD_REQUEST.value());
		
		String errorMsg = exception.getBindingResult().getAllErrors().stream().map(x -> x.getDefaultMessage()).collect(Collectors.joining(","));
		errorInfo.setErrorMessage(errorMsg);
		errorInfo.setTimestamp(LocalDateTime.now());
		return new ResponseEntity<>(errorInfo, HttpStatus.BAD_REQUEST);
		}
	
	
	//for OfficeNotFoundException
	@ExceptionHandler(OfficeNotFoundException.class)
	public ResponseEntity<ApiResponse> handleofficeNotFoundException(OfficeNotFoundException ex){
		return new ResponseEntity<ApiResponse>(new ApiResponse(ex.getMessage(),ex.getMessage()), HttpStatus.NOT_FOUND);
	}
	
	@ExceptionHandler(MethodArgumentNotValidException.class)
	public ResponseEntity<ErrorInfo> exceptionHandlerOffice(MethodArgumentNotValidException exception){
		ErrorInfo errorInfo = new ErrorInfo();
		errorInfo.setErrorCode(HttpStatus.BAD_REQUEST.value());
		
		String errorMsg = exception.getBindingResult().getAllErrors().stream().map(x -> x.getDefaultMessage()).collect(Collectors.joining(","));
		errorInfo.setErrorMessage(errorMsg);
		errorInfo.setTimestamp(LocalDateTime.now());
		return new ResponseEntity<>(errorInfo, HttpStatus.BAD_REQUEST);
		}
	
	
	//for OrderDetailsNotFoundException
	@ExceptionHandler(OrderDetailsNotFoundException.class)
	public ResponseEntity<ApiResponse> handleorderDetailsNotFoundException(OrderDetailsNotFoundException ex){
		return new ResponseEntity<ApiResponse>(new ApiResponse(ex.getMessage(),ex.getMessage()), HttpStatus.NOT_FOUND);
	}
	
	@ExceptionHandler(MethodArgumentNotValidException.class)
	public ResponseEntity<ErrorInfo> exceptionHandlerOrderDetails(MethodArgumentNotValidException exception){
		ErrorInfo errorInfo = new ErrorInfo();
		errorInfo.setErrorCode(HttpStatus.BAD_REQUEST.value());
		
		String errorMsg = exception.getBindingResult().getAllErrors().stream().map(x -> x.getDefaultMessage()).collect(Collectors.joining(","));
		errorInfo.setErrorMessage(errorMsg);
		errorInfo.setTimestamp(LocalDateTime.now());
		return new ResponseEntity<>(errorInfo, HttpStatus.BAD_REQUEST);
		}
	
	
	//for OrderNotFoundException
	@ExceptionHandler(OrderNotFoundException.class)
	public ResponseEntity<ApiResponse> handleOrderNotFoundException(OrderNotFoundException ex){
		return new ResponseEntity<ApiResponse>(new ApiResponse(ex.getMessage(),ex.getMessage()), HttpStatus.NOT_FOUND);
		}

	 
	@ExceptionHandler(MethodArgumentNotValidException.class)
	public ResponseEntity<ErrorInfo> exceptionHandlerOrder(MethodArgumentNotValidException exception){
		ErrorInfo errorInfo = new ErrorInfo();
		errorInfo.setErrorCode(HttpStatus.BAD_REQUEST.value());
		String errorMsg = exception.getBindingResult().getAllErrors().stream().map(x -> x.getDefaultMessage()).collect(Collectors.joining(","));
		errorInfo.setErrorMessage(errorMsg);
		errorInfo.setTimestamp(LocalDateTime.now());
		return new ResponseEntity<>(errorInfo, HttpStatus.BAD_REQUEST);
			}

	 

	//for ProductLineNotFoundNotFoundException
	@ExceptionHandler(ProductLineNotFoundException.class)
	public ResponseEntity<ApiResponse> handleProductLineNotFoundException(ProductLineNotFoundException ex){
		return new ResponseEntity<ApiResponse>(new ApiResponse(ex.getMessage(),ex.getMessage()), HttpStatus.NOT_FOUND);
	}

	@ExceptionHandler(MethodArgumentNotValidException.class)
	public ResponseEntity<ErrorInfo> exceptionHandlerProductLine(MethodArgumentNotValidException exception){
		ErrorInfo errorInfo = new ErrorInfo();
		errorInfo.setErrorCode(HttpStatus.BAD_REQUEST.value());
		String errorMsg = exception.getBindingResult().getAllErrors().stream().map(x -> x.getDefaultMessage()).collect(Collectors.joining(","));
		errorInfo.setErrorMessage(errorMsg);
		errorInfo.setTimestamp(LocalDateTime.now());
		return new ResponseEntity<>(errorInfo, HttpStatus.BAD_REQUEST);
		}

		

	//for ProductNotFoundNotFoundException
	@ExceptionHandler(ProductNotFoundException.class)
	public ResponseEntity<ApiResponse> handleProductNotFoundException(ProductNotFoundException ex){
	return new ResponseEntity<ApiResponse>(new ApiResponse(ex.getMessage(),ex.getMessage()), HttpStatus.NOT_FOUND);
		}

	 @ExceptionHandler(MethodArgumentNotValidException.class)
	 public ResponseEntity<ErrorInfo> exceptionHandlerProduct(MethodArgumentNotValidException exception){
		 ErrorInfo errorInfo = new ErrorInfo();
		 errorInfo.setErrorCode(HttpStatus.BAD_REQUEST.value());
		 String errorMsg = exception.getBindingResult().getAllErrors().stream().map(x -> x.getDefaultMessage()).collect(Collectors.joining(","));
		 errorInfo.setErrorMessage(errorMsg);
		 errorInfo.setTimestamp(LocalDateTime.now());
		 return new ResponseEntity<>(errorInfo, HttpStatus.BAD_REQUEST);
	 	}
	
}
