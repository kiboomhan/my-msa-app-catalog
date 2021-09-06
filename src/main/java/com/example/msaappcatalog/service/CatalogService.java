package com.example.msaappcatalog.service;

import com.example.msaappcatalog.jpa.CatalogEntity;

public interface CatalogService {
    Iterable<CatalogEntity> getAllCatalogs();
}
