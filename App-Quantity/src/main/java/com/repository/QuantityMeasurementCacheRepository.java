package com.repository;

import com.entity.QuantityMeasurementEntity;

import java.util.ArrayList;
import java.util.List;
import com.repository.IQuantityMeasurementRepository;

public class QuantityMeasurementCacheRepository
        implements IQuantityMeasurementRepository {

    private static final QuantityMeasurementCacheRepository INSTANCE =
            new QuantityMeasurementCacheRepository();

    private final List<QuantityMeasurementEntity> store =
            new ArrayList<>();

    private QuantityMeasurementCacheRepository() {}

    public static QuantityMeasurementCacheRepository getInstance() {
        return INSTANCE;
    }

    @Override
    public void save(QuantityMeasurementEntity entity) {
        store.add(entity);
    }

    public List<QuantityMeasurementEntity> findAll() {
        return store;
    }
}
