package org.prgrms.kdt.voucher;

import org.prgrms.kdt.model.voucher.Voucher;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface VoucherRepository {
    Optional<Voucher> findById(UUID voucherId);

    Voucher update(Voucher voucher);

    void insert(Voucher voucher);

    List<Voucher> getAllStoredVoucher();

    void clear();
}