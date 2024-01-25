package github.com.tang.service;

import github.com.tang.entity.AddressBook;

import java.util.List;

/**
 * @Title: AddressBookService
 * @Author hui20-hub
 * @Package github.com.tang.service
 * @Date 2024/1/19 19:29
 */


public interface AddressBookService {

    List<AddressBook> list(AddressBook addressBook);

    void save(AddressBook addressBook);

    AddressBook getById(Long id);

    void update(AddressBook addressBook);

    void setDefault(AddressBook addressBook);

    void deleteById(Long id);

}
