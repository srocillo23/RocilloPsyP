# Kubernetes Practice - README

## Project Overview
This project demonstrates a simple Kubernetes setup with a frontend and backend application. The frontend is a Node.js application using Express, and the backend is a FastAPI service running inside a Kubernetes cluster.

## Prerequisites
Before starting, ensure you have the following installed in our system:
- Docker
- Minikube
- kubectl
- Node.js and npm

## Project Structure
- `server.js`: Express-based frontend service
- `package.json`: Node.js dependencies and scripts
- `backend-deployment.yaml`: Kubernetes Deployment for the backend
- `frontend-deployment.yaml`: Kubernetes Deployment for the frontend
- `service-backend.yaml`: Service definition for backend exposure
- `service-frontend.yaml`: Service definition for frontend exposure

## Installation and Setup
### 1. Start Minikube
```sh
minikube start
```

### 2. Apply Kubernetes Configurations
```sh
kubectl apply -f backend-deployment.yaml
kubectl apply -f service-backend.yaml
kubectl apply -f frontend-deployment.yaml
kubectl apply -f service-frontend.yaml
```

### 3. Check Running Pods and Services
```sh
kubectl get pods
kubectl get services
```

### 4. Access the Application
Find the Minikube service URL:
```sh
minikube service frontend-service --url
```
Open the URL in your browser to access the frontend.

## Troubleshooting
- If any pod is not running, check logs with:
```sh
kubectl logs <pod-name>
```
- Restart Minikube if needed:
```sh
minikube delete
minikube start
```

## Conclusion
This practice provides a basic understanding of deploying applications in Kubernetes. You can extend it by adding more services, persistent storage, or autoscaling.

